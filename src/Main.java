import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String a=sc.nextLine();
            //候选人数
            int candidate=Integer.parseInt(a);
            String b=sc.nextLine();
            //候选人名
            String[] name=b.split(" ");
            Map<String,Integer> map=new HashMap<>();
            for(int i=0;i<name.length;i++){
                map.put(name[i],0);
            }
            String c=sc.nextLine();
            //投票人数
            int vote=Integer.parseInt(c);
            String d=sc.nextLine();
            //投票对象
            String[] votedName=d.split(" ");
            int count=0;
            for(int i=0;i<vote;i++){
                if(map.containsKey(votedName[i])){
                    int j=map.get(votedName[i]);
                    map.put(votedName[i],j+1);
                }else{
                    count++;
                }
            }
            int j=0;
            while(j<name.length) {
                for (Map.Entry<String, Integer> e : map.entrySet()) {
                    String v = e.getKey();
                    int w = e.getValue();
                    if(v.equals(name[j])){
                        System.out.println(v + " : " + w);
                        break;
                    }
                }
                j++;
            }
            System.out.println("Invalid : "+count);
        }
    }
}