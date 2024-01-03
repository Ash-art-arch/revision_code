package revision_code;
import java.util.*;

class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<access_times.size();i++){
            String name=access_times.get(i).get(0);
            String time =access_times.get(i).get(1);
            int currentTime= Integer.parseInt(time)+2400;
            int count=0;
            for(int j=0;j<access_times.size();j++){
                String upname=access_times.get(j).get(0);
                if(i!=j&&name.equals(upname)){
                    String uptime=access_times.get(j).get(1);
                    int upTime= Integer.parseInt(uptime)+2400;
                    if(upTime!=currentTime&&Math.abs(upTime-currentTime)<100){
                        count++;
                    }
                }
            }
            if (count>=3&&ans.indexOf(name)==-1) {
                ans.add(name);
            }
            
        }
        return ans;
    }
}