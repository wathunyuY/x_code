
public class Testing {
	public static void main(String[] args){
		System.out.println("Hellowold");
		int tt = 1;//(12*60*60)+(10*60)+(11);
		for(int i=0;i<tt;i++){
		int start_time_h=0,start_time_m=20,start_time_s=48;
		int h=9,m=27,s=0;
		
		if(h < start_time_h)h+=24;
		if(m <= start_time_m){m+=60;h = h >0 ? h-1:h;}
		if(s <= start_time_s){s+=60;m = m >0 ? m-1:m;}
		
//		if()
//		if(h)h=11+start_time_h,m=32+start_time_m,s=52+start_time_s;
		
		int sumNow = (h*3600)+(m*60)+s;
		int sumBegin = (start_time_h*3600)+(start_time_m*60)+start_time_s;
		
		int sumTime = Math.abs(sumNow-sumBegin);
		
		int hour_mod = sumTime%3600;
		int min_mod = hour_mod%60;
		int sum_hour = (sumTime - hour_mod) /3600;
		int sum_min  = (hour_mod - min_mod) /60;
		int sum_sec  = min_mod;
		
//		return String(sum_hour)+String(sum_min)+String(sum_sec);
		System.out.printf("%d : %d >>>%d %d %d\n",i,Math.abs(sumNow-sumBegin),sum_hour,sum_min,sum_sec);
		
		}
		
		
	}
}

