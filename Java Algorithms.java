import javax.net.ssl.Status;

import java.text.DecimalFormat;
import java.text.spi.DecimalFormatSymbolsProvider;

import javax.lang.model.element.Element;

public class Perfect {
    public static void main(String[] args) {
        double b = isPerfectSquare(6);
        System.out.println(b);
        double c = isPerfectSquare(36);
        System.out.println(c);
        double d = isPerfectSquare(-5);
        System.out.println(d);
        double e = isPerfectSquare(0);
        System.out.println(e);

    }

    public static double isPerfectSquare(int a) {

        double nextPerfect = 0;
        if (a >= 0) {
            double isPerfectSquare = (int) Math.sqrt(a);
            double plus = isPerfectSquare + 1;
            nextPerfect = Math.pow(plus, 2);

        }

        return nextPerfect;

    }

}

public class Perfect{

public static double isPerfectSquare(int[] a, int b ) {
int num=0;
int counter=0;
for(int i=0;i<a.length;i++){
num=num+a[i];
if(num>=b){
counter++;
}

}
return counter;
}
public static void main(String[] args){
int [] a={6,3,1};
System.out.println(Perfect.isPerfectSquare(a, 6));
}

}

public class nUpCount{
public static void main(String[] args){
int result = count(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5);
System.out.println(result);
result = count(new int[]{6, 3, 1}, 6);
System.out.println(result);
result = count(new int[]{1, 2, -1, 5, 3, 2, -3}, 20);
System.out.println(result);
}

static int count(int[] a, int n){
int nUpCount = 0;
int partialSum = 0;
int previousPartialSum = 0;
for(int i=0; i<a.length; i++){
previousPartialSum = partialSum;
partialSum += a[i];
if(previousPartialSum <= n && partialSum > n){
nUpCount++;
}
}
return nUpCount;
}
}
public class Count{
    public static void main(String[] args){
    int result = primeCount(10,30);
    System.out.println(result);
    int resul = primeCount(11,29);
    System.out.println(resul);
    int resu = primeCount(20,22);
    System.out.println(resu);
    int res = primeCount(1,1);
    System.out.println(res);
    int re = primeCount(5,5);
    System.out.println(re);
    int r = primeCount(6,2);
    System.out.println(r);
    int t = primeCount(-10,6);
    System.out.println(t);
    
    }
    
    
    public static int  primeCount(int start, int end){
    int count = 0;
    boolean status=false;
    if(end==1)
    return 0;
    if(start<0)
    start=2;
    
    for(int i=start; i<=end; i++){
        for(int j=2;j<i;i++)
    if(i%j==0){
        status=true;
        continue;
        
        }
        if(status=false)
        count++;
   
    }
    return count;
    }
    }
    public class Count{
            public static void main(String[] args){
            int[] arr = isInertial(new int[] {2,4,6,5}) ;
           
            }
    
    public static int[] isInertial(int[] a) {
        int max =a[0];
        boolean status=false;
        int odd=0;
        int even=0;
        
        
        for(int i=0; i<a.length; i++){
                if(a[i]%2==0)
                a[0]=a[i];
                    even++;
                    
                else
                odd++;
                
                
         }
         System.out.println(odd);
        
            return a ;
        }
       
        }
        
        
       
   
    public class inertial {
        public static void main(String[] args) {
            System.out.println( f(new int[]{1}));
            System.out.println(f(new int[]{2}));
            System.out.println(f(new int[]{1, 2, 3, 4}));
            System.out.println( f(new int[]{1, 1, 1, 1, 1, 1, 2}));
            System.out.println(f(new int[]{2, 12, 4, 6, 8, 11}));
            System.out.println(f(new int[]{2, 12, 12, 4, 6, 8, 11}));
            System.out.println(f(new int[]{-2, -4, -6, -8, -11}));
            System.out.println(f(new int[]{2, 3, 5, 7}));
            System.out.println( f(new int[]{2, 4, 6, 8, 10}));
        }
    
        public static int f(int[] a) {
            if(a.length < 2) return 0;
            int i, j, max = a[0], odd = 0;
            int[] oddArray = new int[a.length];
    
            for(i = 0, j = 0; i < a.length; i++) {
                if((a[i] % 2) != 0)
                 oddArray[odd++] = a[i];
                if(a[i] > max)
                 max = a[i];
              
            }
          
            if(max % 2 != 0 || odd < 1) return 0;
            
            for(i = 0; i < odd; i++) {
                for(j = 0; j < a.length; j++) {
                    if(a[j] % 2 == 0 && a[j] != max && a[j] > oddArray[i]) return 0;
                }
            }
         
            return 1;
        }
    }
    public class SquarePairs {
        public static void main(String[] args) {
    
         //  System.out.println(isPerfectSquare(8));
           int a[] = {9,0,2,-5,7};
          //int a[] = {9};
            //int a[] = {2, 7, 2, 2};
            System.out.println(countSquarePairs(a));
        }
    
        public static int countSquarePairs(int[] a){
    
            int length = a.length;
            if (length < 2){
                return 0;
            }
            int countsq=0;
            for (int i=0; i< length; i++){
                for (int j=0; j< length; j++){
                    if (i!=j){
                        if(a[i]==a[j]){
                            return 0;
                        }
                        if((a[i] < a[j] && isPerfectSquare(a[i]+a[j]) ) && a[i]>0 && a[j]>0 ){
                            System.out.println("ai"+a[i]);
                            System.out.println("aj"+a[j]);
                             countsq++;
    


                    }
                }
            }
    
            return countsq;
        }
        public static boolean isPerfectSquare(int a){

            double k = Math.sqrt(a);
             int m = (int)k; //
             if( m - k == 0){
                 return true;
             }
     
             return false;
         }
    //  }
    public class SquarePairs {

    
        public static int countSquarePairs(int[] a){
            if(a.length<2)
            return 0;
            int counter=0;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    if(i!=j){
                        if(a[i]==a[j])
                        return 0;
                    }
                    if(a[i]<a[j] && a[i]>0 && a[j]>0 && isPerfectSquare(a[i]+a[j])){
                        System.out.println("a[i]"+a[i]);
                        System.out.println("a[j]"+a[j]);
                        counter++;

                    }
                    
                    }
                }
                return counter;

            }
            public static boolean isPerfectSquare(int b){
                
                double num= Math.sqrt(b);
                int rop=(int)num;
                if(num-rop==0){
                    return true;
                }
                return false;

            }
    
           
    
    

        public static void main(String[] args) {
    
         //  System.out.println(isPerfectSquare(8));
           int a[] = {9,0,2,-5,7};
          //int a[] = {9};
            //int a[] = {2, 7, 2, 2};
            System.out.println(SquarePairs.countSquarePairs(a));
        }
    }
    public class SquarePairs {
       
        public static int isMadhavArray(int[] a)
        {
           
            int counter=0;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    
                    if(i!=j){
                        if(a[i]+a[j]>n){
                            counter++;
                        }
                    }
                    
                    }
                    break;
                }
                return counter;

            }
            public static void main(String[] args) {
    
                //  System.out.println(isPerfectSquare(8));
                  int a[] = {6,3,1};
                 //int a[] = {9};
                   //int a[] = {2, 7, 2, 2};
                   System.out.println(SquarePairs.countSquarePairs(a, 5));
               }
           
    
           
    
    
    }
      
    public class SquarePairs {
       
        public static  int findPorcupineNumber(int n)
        {
           boolean status=false;
        
            for(int i=2;i<n;i++){
                if(n%i==0){
                    status=true;
                }
                
                }
                if(status==true){
                    return 0;
                }else{
                    if(n%10==9)
                    return 1;
                }
                return 0;

            }
            public static void main(String[] args) {
    
                //  System.out.println(isPerfectSquare(8));
                  int a = findPorcupineNumber(39);
                 //int a[] = {9};
                   //int a[] = {2, 7, 2, 2};
                   System.out.println(a);
               }
           
    
           
    
    
    }

    public class SquarePairs {
        public static void main(String[] args) {
    
            //  System.out.println(isPerfectSquare(8));
              int[] a ={8, 4,2, 1}  ;
             //int a[] = {9};
               //int a[] = {2, 7, 2, 2};
               System.out.println(isGuthrieSequence(a));

           }
      
            public static int isGuthrieSequence(int[] a) {
                if(a[a.length-1]!=1){
                    return 0;
                }
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] % 2 == 0) {
                        if (a[i] / 2 != a[i + 1]) {
                            return 0;
                        }
                    } else {
                        if (a[i] * 3 + 1 != a[i + 1]) {
                            return 0;
                        }
                    }
                }
                return 1;
            }
            
        }
        
                
               
                  
                 
        
    
       
       
        // public static  int isGuthrieSequence(int[] a)
        // {
        
        
        //     for(int i=0;i<a.length;i++){
        //         if(a[i]>0  && a[a.length-1]==1){
        //             if((a[i]%2==0 && a[i+1]==a[i]/2) || (a[i]%2!=0 && a[i+1]==a[i]*3+1)){
        //                 return 1;
        //             }else{
        //                 return 0;
        //             }
        //         }
               
        //         }
                
        //         return 0;

           // }
            
    
           
    
    
    //}



    public class SquarePairs {
        public static void main(String[] args) {
    
            //  System.out.println(isPerfectSquare(8));
            int[] a = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}  ;
             //int a[] = {};
               //int a[] = {2, 7, 2, 2};
               System.out.println(stantonMeasure(a));

           }
      
            public static int stantonMeasure(int[] a)
            {
                int counter=0;
                for (int i = 0; i < a.length; i++) {
                    if(a[i]==1){
                        counter++;
                    }
                }
                int count=0;
                for (int i = 0; i < a.length; i++) {
                    if(a[i]==counter){
                        count++;
                    }
                }
                
               
               
               return count;
            }
            
        }
    public class SquarePairs {
        public static void main(String[] args) {
    
            //  System.out.println(isPerfectSquare(8));
            int a =  guthrieIndex(3) ;
             //int a[] = {};
               //int a[] = {2, 7, 2, 2};
               //System.out.println(a);;

           }
      
            public static int guthrieIndex(int n)
            { 
                if(n<0||n==1)
                return 0;
                int counter=0;
              
            
               
                for (int i = 0; i < n; i++) {
                  
                   
                    if(n%2==0){
                        n=n/2;
                        
                    }else{
                        n=n*3+1;
                       
                    }
                    counter++;
                   
                }
                System.out.println(counter);
                
                
                 return counter;
            }
            
        }
    public class SquarePairs {
       
            public static  int repsEqual(int[] a, int n)
            { 
                int isrepEqual=0;
             for (int i = a.length-1; i>=0; i--) {
                  
                   int lastdigit=n%10;
                   n=n/10;
                if(a[i]==lastdigit){
                    isrepEqual=1;
                }else{
                    isrepEqual=0;
                    break;
                }
                   
                }
                return isrepEqual;
               
            }
            public static void main(String[] args) {
    
                //  System.out.println(isPerfectSquare(8));
                int[] a ={4,5,6,6} ;
                 //int a[] = {};
                   //int a[] = {2, 7, 2, 2};
                   System.out.println(SquarePairs.repsEqual(a, 456));
    
               }
          
            
        }
    public class SquarePairs {
       
        public static  int factor(int i,int j)
        { 
            int henry=0;
            
           int max=Integer.MAX_VALUE;
            int counter=0;
            
            for(int num=1;num<max;num++){
               int sum=0;
                   
         for (int divider = 1; divider<num; divider++) {
            if(num % divider==0){
          sum+=divider;
            }
            
            }
            if(sum==num){
                counter++;
                if(counter==i){
                    henry+=sum;
                   
                }else if(counter==j){
                    henry+=sum;
                    break;
                    
                }
               
                
            }
            }
        

            return henry;
           
        }
        public static void main(String[] args) {

            //  System.out.println(isPerfectSquare(8));
           
             //int a[] = {};
               //int a[] = {2, 7, 2, 2};
               System.out.println(SquarePairs.factor(1,3));

           }
      
        
    }

    public class SquarePairs {
       
        public static int isDivisible(int [ ] a, int divisor)

        { 
           
            int check=1;
            for(int i=0;i<a.length;i++){
                if(a[i]%divisor!=0){
                check=0;
                break;

                }
               
            
           
        }
        return check;
    }
        public static void main(String[] args) {

            //  System.out.println(isPerfectSquare(8));
           
             int a[] = {};
               //int a[] = {2, 7, 2, 2};
               System.out.println(SquarePairs.isDivisible(a, 2));

           }
      
        
    }
    
    public class SquarePairs {
       
        public static int isNUnique(int[] a, int n)

        { 
           int status=0;
          
                    if (a.length < 2) {
                    status= 0;
                    }
                    int count = 0;
                    for (int i = 0; i < a.length - 1; i++) {
                        if (a[i] > n) {
                            continue;
                        }
                        for (int j = i + 1; j < a.length; j++) {
                            if (n == a[i] + a[j]) {
                                System.out.println(n);
                                count++;
                            }
                        }
                    }
                    if (count == 1) {
                        status= 1;
                    }
                    status=0;
                    return status;
                }
              
                
            
        

        public static void main(String[] args) {

           
           
             int a[] = {7, 3, 3, 2,4};
               //int a[] = {2, 7, 2, 2};
               System.out.println(SquarePairs.isNUnique(a, 6));

           }
      
        
    }
    public class SquarePairs {
       
        public static int isSquare(int n)

        { 
           int status=0;
          
                    if (n < 0) {
                    status= 0;
                    }
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (i*i==n) {
                            status= 1;
                            break;
                           
                        }  

                        
                    }
                    
                    return status;
                }
              
                
            
        

        public static void main(String[] args) {

           
           
        
               //int a[] = {2, 7, 2, 2};
               System.out.println(SquarePairs.isSquare(116));

           }
      
        
 }
 public class SquarePairs {
       
    public static int convertToBase10(int[ ] a, int base){ 
               
                int pro=0;
                int status=1;
                for(int j=0;j<a.length;j++){
                if(a[j]>base){
                        status=0;
                        break;

                    }else{
                        pro+=a[j]*(Math.pow(base,a.length-1-j));
                  
                    }
                     
                    
                }
               

                return pro ;
            }
          
            
        
    

    public static void main(String[] args) {

 int a[] = {1,1,2};
           System.out.println(SquarePairs.convertToBase10(a, 3));

       }
  
    
}
public class SquarePairs {
       
    public static int convertToBase10(int[ ] a){ 
               
                int pro=1;
               
                for(int j=0;j<a.length;j++){
               if(a[j]==0){
                pro=0;
                break;
                
               }

                    
                }
               

                return pro ;
            }
          
            
        
    

    public static void main(String[] args) {

 int a[] = {1,1,2,0,9};
           System.out.println(SquarePairs.convertToBase10(a));

       }
  }

  public class SquarePairs {
       
    public static int convertToBase10(int a){ 
            int pro=0;   
        int  status=0;
               
                for(int i=1;i<=a;i++){
                         pro=pro+i;
                         if(pro==a){
                            status=1;
                            break;
                           
                             }
                         }
                   
                         
            return status;
            }
              public static void main(String[] args) {

 //int a[] = {1,1,2,0,9};
           System.out.println(SquarePairs.convertToBase10(8));

       }
  
    
}

public class SquarePairs {
       
    public static int convertToBase10(int[] a){ 
            int sum=0;
            int status=1;
               for(int i=0;i<a.length;i++){
                sum+=a[i];
              }
              for(int i=0;i<a.length;i++)
              if(sum==a[i]){
                status=0;
                break;
              }
                         
                   
                         
            return status;
            }
              public static void main(String[] args) {

 int a[] = {5, -2, 1} ;
           System.out.println(SquarePairs.convertToBase10(a));

       }
  
    
}
public class SquarePairs {
       
  public static int isIsolated(long n){ 
      double sq=n*n;
      double cub=n*n*n;
      System.out.println(sq);
      System.out.println(cub);
      int status=1;
      

                       if( cub >2097151 || n<1){
                        status=-1;
                       }else{
                        for(int i=0;i<8;i++){
                          if(sq%10==cub%10){
                            sq=sq/10;
                            cub=cub/10;
                            status=0;
                            break;
                           }
                        }
                       }
                
                       
          return status ;
          }
            public static void main(String[] args) {

//int a[] = {5, -2, 1} ;
         System.out.println(SquarePairs.isIsolated(62));

     }

  
}

public class SquarePairs {
       
  public static int isVanilla(int[] a){ 
          int mainDigit=a[0]%10;
          int tempDigit=0;
          int element=0;
        
             for(int i=0;i<a.length;i++){
            element=a[i];
            while (element!=0) {
              tempDigit=element%10;
              if(mainDigit!=tempDigit){
                return 0;
              }
            element=element/10;
              
            }
            }
            return 1;
          }
            public static void main(String[] args) {

int a[] = {11,111,11,1111,1111131} ;
         System.out.println(SquarePairs.isVanilla(a));

     }

  
}


public class SquarePairs {
       
  public static int vanilla(long a){ 
    if(a<1||a*a*a>Long.MAX_VALUE){
      return -1;
    }else{
      long square=a*a;
      long cube=a*a*a;
      long tempSquare=square;
      int cubeModule=(int)cube%10;
      while (cube !=0) {
        int squareModule=(int)tempSquare%10;
        while (tempSquare!=0) {
          if(cubeModule==squareModule){
            return 0;
          }
          tempSquare=tempSquare/10;
          squareModule=(int)tempSquare%10;
        }
        cube=cube/10;
        cubeModule=(int)cube%10;
        tempSquare=square;
          
      }
      
    }
        
            
                       
                 
                       
          return 1 ;
          }
            public static void main(String[] args) {

long a= vanilla(4);
         System.out.println(a);

     }

  
}
public class SquarePairs {
       
  public static int isMinMaxDisjoint(int[ ] a) { 
    if(a == null || a.length<2){
      return 0;
    }else{
      int max=a[0];
      int min=a[0];
       for(int i=0;i<a.length;i++){
         if(max<a[i]){
           max=a[i];
         }
         if(min>a[i]){
           min=a[i];
         }}
         if(max==min || min==max+1){
           return 0;
         }
         int count=0;
         for(int i=0;i<a.length;i++){
           
           if(max==a[i]){
             count++;
           }
         }
           if(count>1){
             return 0;
           }
        
         int counter=0;
         for(int i=0;i<a.length;i++){
           if(min==a[i]){
             counter++;
         }}
         
           if(counter>1){
             return 0;
           }

    }
    
  
      
      return 1 ;
    }
    public static void main(String[] args) {
      int[] a= {18, -1, 3, 4, 0} ;
      System.out.println(SquarePairs.isMinMaxDisjoint(a));
    }
  }

public class SquarePairs {
       
  public static int isDual(int[] a){ 
    check if a.length is even else not dual.
int status=1;
        
        for(int i=0;i<a.length;i++){
          int counter=0;
          for(int j=0;j<a.length;j++){
            if(a[i]==a[j]){
              counter++;
            }
          }
          if(counter!=2)
            status=0;
            break;
            
  }
            return status;
          }
            public static void main(String[] args) {

int a[] = {3,1,1,2,2} ;
         System.out.println(SquarePairs.isDual(a));

     }

  
}
public class SquarePairs {
  
       
  public static int isFilter(int[] a){
    int status=1; 
    for(int i=0;i<a.length;i++){
      if(a[i]==9){
       
        for(int j=0;j<a.length;j++){
          if(a[j]==11){
            status= 1;
            break;
          }else{
            status= 0;
          }
        }
      }else if(a[i]==7){
        for(int k=0;k<a.length;k++){
          if(a[k]==13){
            status=0;
            break;
          }
        }
      }
      }

        
        
            return status;
          }
            public static void main(String[] args) {

int a[] =  {3, 4, 6, 7, 14, 16}   ;
         System.out.println(SquarePairs.isFilter(a));

     }

  
}

public class SquarePairs {
       
  public static int isOddHeavy (int[] a){ 
    int max=a[0];
    int status=1;
for(int i=0;i<a.length;i++){
if(a[i]>max){
  max=a[i];
}
}

for(int j=0;j<a.length;j++){
if(max%2==0){
  status=0;
  break;
}


}
 
            return status;
          }
            public static void main(String[] args) {

int[] a = {11,4,9,2,8,12,56,83,436};
        System.out.println(SquarePairs.isOddHeavy(a));

     }

  
}
public class SquarePairs {
       
  public static int isAdjecent(int[] a){ 
    int sum=0;
    int max=0;
for(int i=1;i<a.length;i++){
 sum= a[i-1]+a[i];
 if(max<sum){
  max=sum;
 }
}


return max;
}
  public static void main(String[] args) {

int[] a = {1,1,1,1,1,1,1,2,1,1,1,1,1,1};
System.out.println(SquarePairs.isAdjecent(a));
}
}
public class SquarePairs {

public static int isConcatnatedSum(int n, int a){ 
 int sum=0;
  while (n<1) {
    int lastModulo=n%10;
    int lastRepeat=lastModulo*10+lastModulo;
     
      sum=sum+lastRepeat;
    n= n/10;
   
  }
  
//   if(n!=sum){
// return 0;
//   }


return b;
}
public static void main(String[] args) {


System.out.println(SquarePairs.isConcatnatedSum(198, 2));
}
}

public class SquarePairs {

  public static int isBean(int[] a){ 
    int s=0;
for(int i=1;i<a.length;i++){
    s=0;
  for(int j=1;j<a.length;j++){
    if ((a[j]+1)==a[i] || (a[j]-1)==a[i]) {
      s=1;
      break;
      
    }
  }
  if (s==0) {
    s=0;
    break;
  }
}


return s;
}
  public static void main(String[] args) {

int[] a = {1,1,1,2,1,1};
System.out.println(SquarePairs.isBean(a));
}
}
    public class SquarePairs {

    public static int isDaphne(int[] a){ 
      int counter=0;
  for(int i=1;i<a.length;i++){
    if (a[i]%2!=0) {
     counter++;
    }
  }
  if(counter==0){
    return 0;
  } else if (a[0]%2!=0) {
    return 0;
    
  }else if (a[a.length-1]%2!=0) {
    return 0;
    
  }else {
    int fCounter=0;
    int lCounter=0;
    for(int j=1;j<a.length;j++){
      if (a[j]%2==0) {
        fCounter++;
      }
      if (a[a.length-1-j]%2==0) {
        lCounter++;
        
      }
      if (fCounter!=lCounter) {
        return 0;
        
      }
    }
  }
      
   

  
  
  return 1;
  }
    public static void main(String[] args) {
  
  int[] a = {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6};
  System.out.println(SquarePairs.isDaphne(a));
  }
  }
  
  
public class SquarePairs {

    public static int islargestPrimeFactor(int n){ 
        int max=0;
  for(int i=2;i<n;i++){
     if (n%i==0) {
        int a=i;
        int status=1;
   
        for(int j=2;j<a;j++){
            if (a%j==0) {
                status=0;
                break;
            }
            }
           
            if (status==1) {
                if (max<a) {
                    max=a;
              
                
            }
       
        }
     } 

}
  
  return max;
  }
    public static void main(String[] args) {
  

  System.out.println(SquarePairs.islargestPrimeFactor(6936 ));
  }
  }


public class SquarePairs {

    public static void main(String[] args) {
        int[] a={4,5,6,7,8};
        int[] b={8,9,4,56,6,7,8,9};
        int[] c= new int[3];
        for(int i=0;i<3;i++){
            c[i]=a[i]+b[i];
       }
        
      
       
       
        for(int i=0;i<3;i++){
        System.out.print(c[i]+" ");
       }

       
  
    }
 
  }
public class SquarePairs {

    public static int isCube(int a) {
       double sum=0;
            int n=a;
        while (n !=0) {
          int lastDigit=n%10;
          Double cube=Math.pow(lastDigit, 3);  
          sum=sum+cube;
          n=n/10;
        }
       
          
       if (sum!=a) {
        return 0;
       }

       
       
        return 1;
        
       }
        
    
       public static void main (String[] args){
        System.out.println(SquarePairs.isCube(153));

       }
  
 public class SquarePairs {

  public static int isZeroPlanty  (int[] a) {
    int zeroCounter=0;
    int plentyCounter=0;
    for(int i=0;i<a.length;i++){
   if (a[i]==0) {
    zeroCounter++;
    
   }
   if (zeroCounter>=4) {
    plentyCounter++;
    zeroCounter=0;
   }
   }
    return plentyCounter;
           
           }
           public static void main (String[] args){
             int[] a={1, 0, 0, 0, 2, 0, 0, 0, 0};
             System.out.println(SquarePairs.isZeroPlanty(a));
           }
         }


public class SquarePairs {

  public static int isDigitIncreasing(int n) {
   
    for(int i=1;i<=9; i++){
      int sum=0;
      int num=i;
      for(int j=1;j<=9; j++){
        sum=sum+num;
        if (sum==n) {
          return 1;
        }
        if (sum>n) {
          break;
        }
        num=num*10+i;
   
   }
   }
    return 0;
           
           }
           public static void main (String[] args){
            
             System.out.println(SquarePairs.isDigitIncreasing(982));
           }
         }


 public class SquarePairs {

  public static int isHappyPrime(int n) {
    int status=0;
    int sum=0;
     for(int j=2;j<n; j++){
      if (isPrime(j)) {
        sum=sum+j;
      }
      }
      
    if (sum%n==0) {
      status=1;
    }
    return status;
  }
 
 
public static boolean isPrime(int a){
  boolean check=true;
  for(int i=2;i<a; i++){
    if (a%i==0) {
      check=false;
      break;
    }
}
       
         
        return check;
       
    }
    
    
   
            
            
            public static void main (String[] args){
            
              System.out.println(SquarePairs.isHappyPrime(2));
            }
          }
public class SquarePairs {

  public static int isPrimeFactorial(int n) {
   int product=1;
    for(int i=1;i<=n; i++){
       product=product*i;
       if (product+1==n) {
          return 1;
       }
   }
    return 0;
           
           }
           public static void main (String[] args){
            
             System.out.println(SquarePairs.isPrimeFactorial(721));
           }
         }

public class SquarePairs {

  public static int isLargestDifferenceOfEven(int[] a) {
   int counter=0;
   int max=a[0];
   int min=a[0];
   int diff=0;
    for(int i=0;i<a.length; i++){
      if (a[i]%2==0) {
        counter++;
        if (max<a[i]) {
          max=a[i];
        }
        if (min>a[i]) {
          min=a[i];
        }
      }
    }
    if (counter<2) {
      return -1;
      
    }
      
       diff=max-min;
      
   
      
     
    return diff ;
           
           }

           public static void main (String[] args){
            int[] a={1, 2, 1, 2, 1, 4, 1, 6, 4};
             System.out.println(SquarePairs.isLargestDifferenceOfEven(a));
           }
         }

public class SquarePairs {
  public static int isHodder(int n) {
    int productDiff=0;
    int product=1;
    while (n>=productDiff) {
      product=product*2;
      productDiff=product-1;
      if (productDiff==n) {
        return 1;
      }
    }
     
     return 0;
            
            }

  public static boolean isPrime(int a) {
   boolean check=true;
  
    for(int i=2;i<a; i++){
      if (a%i==0) {
        check=false;
        break;
     }
      
   }
    return check;
           
           }
           
           public static void main (String[] args){
            
             System.out.println(SquarePairs.isHodder(31));
           }
         }

public class SquarePairs {

  public static int areAnagrams(char [ ] a1, char [ ] a2) {
    int counter=0;
    int status=1;
    for(int i=0;i<a1.length; i++){
      for(int j=0;j<a2.length; j++){
       if (a1[i]==a2[j]) {
        counter++;
       }
      
      }
   }
   if (counter==1) {
    return 1;
   }
    return 0;
           
           }
           public static void main (String[] args){
            char[] a1={'s', 'i', 't'};
            char[] a2={'i', 't', 's'};
             System.out.println(SquarePairs.areAnagrams(a1, a2));
           }
         }

public class SquarePairs {

  

      
       
        public static int closestfib(int n){
          int first=0;
          int second=1;
          int sum=0;
          int b=0;
          while(sum<n){
           b=sum;
            sum=first+second;
            
            first=second;
            second=sum;
           
          }
          
            return b;
        }
               
               
               public static void main (String[] args){
                
                 System.out.println(SquarePairs.closestfib(34));
               }
             }
        public class SquarePairs {

            public static int isTriangular(int n) {
             int sum=0;
             int status=0;
              for(int i=1;i<n; i++){
                 sum=i+i+i;
            if(sum==n){
            status=1;
            break;
            }
             }
            
              return status;
                     
                     }
                     public static void main (String[] args){
                      
                       System.out.println(SquarePairs.isTriangular(4));
                     }
                }
        public class SquarePairs {
            

            public static int isMartial(int[] a) {
            int counterOne=0;
            int counterTwo=0;
              for(int i=0;i<a.length; i++){
        
            if(a[i]==1){
            counterOne++;
            
            }else if (a[i]==2) {
                counterTwo++;
            }
        
             }
             if (counterOne<=counterTwo) {
                return 0;
             }else{
                for(int j=0;j<a.length-1;j++){
                    if (a[j]==a[j+1]) {
                        return 0;
                    }
                }
             }
        
              return 1;
                     
                     }
                     public static void main (String[] args){
                      int[] a={2} ;
                       System.out.println(SquarePairs.isMartial(a));
                     }
                }
        public class SquarePairs {

            public static int isPairedN(int[] a, int n) {
                int status=0;
             if (a.length<n/2) {
                status=0;
             }else{
            
                for(int i=1;i<a.length; i++){
                    for(int j=1;j<a.length; j++){
                 if (a[i]+a[j]==n && i+j==n) {
                    status=1;
                    break;
                 }
                    }
                }
             }
             
           
              
            
              return status;
                     
                     }
                     public static void main (String[] args){
                       int[] a={};
                       System.out.println(SquarePairs.isPairedN(a, 0));
                     }
                }
        public class SquarePairs {

            public static int isNprime(int[] a,int n) {
             int status=1;
              for(int i=0;i<a.length; i++){
            int sum=a[i]+n;
                 if ( isPrime(sum)==0) {
                    status=0;
                    break;
                 }
             }
              return status;
                     
                     }
                     public static int isPrime(int f) {
                        int check=1;
                         for(int i=2;i<f; i++){
                       
                            if (f%i==0) {
                               check=0;
                               break;
                            }
                        }
                         return check;
                                
                                }
                     public static void main (String[] args){
                        int[] a={};
                      
                       System.out.println(SquarePairs.isNprime(a, 2));
                     }
                   }
        public class SquarePairs {
          public  static int[] pairwiseSum(int[] a) {
                if (a.length <= 0 || a.length % 2 != 0)
                    return null;
        
                int[] result = new int[a.length / 2];
        
                for (int i = 0, index = 0; i < a.length - 1 && index < result.length; i = i + 2, index++) {
                    result[index] = a[i] + a[i + 1];
                }
        
                return result;
            }
             public static void main (String[] args){
                      int[] a={2, 1, 18, -5};
                       System.out.println(SquarePairs.pairwiseSum(a));
                     }
                   }
        public class SquarePairs {
            public  static int isSquare(int n) {
                 
          int status=0;
                  for (int i=0;i<=n;i++) {
                    int square=i*i;
                    if (square==n) {
                        status=1;
                        break;
                    }else if (n<square) {
                        break;
                    }
                  }
          
                  return status;
              }
               public static void main (String[] args){
                
                         System.out.println(SquarePairs.isSquare(-4));
                       }
                     }
        public class SquarePairs {
            public  static int isComplete(int[] a) {
                 
          int status=0;
          
                  for (int i=0;i<a.length;i++) {
                    if (a[i]%2==0) { 
                      for (int k=0;k<a.length-1;k++) {
                        if ( a[k]+a[k+1]==8) {
                          for (int j=0;j<a.length;j++) {
                            double squareRoot=Math.sqrt(a[j]);
                            int root=(int)squareRoot;
                              if (squareRoot-root==0) {
                                  status=1;
                                  break;
                           
                            
                          
                          }
                         
                          }              
                        }
                      }
                          
                      
                    }
                  }
                  return status;
                }
                public static void main (String[] args){
                  int[] a={3, 2, 9, 5};
                  System.out.println(SquarePairs.isComplete(a));
                }
              }
        public class SquarePairs {

          public static int allValueThe(int[] a) {
            int status=1;
            for(int i=1;i<a.length-1; i++){
              if(a[i]!=a[i+1]){
          status=0;
          break;
          }
           }
          
            return status;
                   
                   }
                   public static void main (String[] args){
                    int[] a={1,1,1,1,1,1,2};
                     System.out.println(SquarePairs.allValueThe(a));
                   }
              }
        public class SquarePairs {

          public static int sameNumberOfFactors(int n1, int n2) {
            int counter=0;
            int count=0;
            if (n1<0 || n2<0) {
              return -1;
            }
            for(int i=1;i<=n1; i++){
              if (n1%i==0) {
              counter++;
              }
           }
           for(int j=1;j<=n2; j++){
            if (n2%j==0) {
            count++;
            }
         }
          if (counter==count) {
            return 1;
          }
            return 0;
                   
                   }
                   public static void main (String[] args){
                   
                     System.out.println(SquarePairs.sameNumberOfFactors(23, 97));
                   }
              }
        public class SquarePairs {

          public static double eval(double x, int[] a) {
            double sum=0;
            for(int i=a.length-1;i>=0; i--){
             double product=a[i];
             double poly=a[i]*Math.pow(x, i);
             sum=sum+poly;
           }
          
          
            return sum;
                   
                   }
                   public static void main (String[] args){
                    int[] a={3, -2, -1} ;
                     System.out.println(SquarePairs.eval(2, a));
                   }
              }
        public class SquarePairs {

          public static int  isAllPossible( int[] a) {
            int counter=0;
            int status=1;
            for(int i=0;i<a.length; i++){
             for(int j=0;j<a.length;j++){
              if (i==a[j]) {
                counter++;
              }
             }
             if (counter==0) {
              status=0;
              break;
             }
           }
          
          
            return status;
                   
                   }
                   public static void main (String[] args){
                    int[] a={1,3,2,0,4} ;
                     System.out.println(SquarePairs.isAllPossible(a));
                   }
              }
        public class SquarePairs {

          public static int  isLayered( int[] a){
            int status=0;
          
            for(int i=0;i<a.length-1; i++){
            if (a[i]>a[i+1]) {
                status=0;
                break;
            }else{
              status=1;
              for(int j=0;j<a.length;j++){
                int counter=0;
                for(int k=0;k<a.length;k++){
                  if (a[j]==a[k]) {
                    counter++;
                  }
                  
                 }
                 if (counter<2) {
                  status=0;
                  break;
                 }
                 
               }
            }

            }
            return status;
                   
                   }
                   public static void main (String[] args){
                    int[] a=  {}   ;
                     System.out.println(SquarePairs.isLayered(a));
                   }
                  }
        public class SquarePairs {
        public static int isconsecutive(int n){
          int	currentnum=0;
          int previousnum=0;
            
            for(int i=2;i<=n;i++){
              if(n%i==0){
                currentnum=i;
                if(currentnum-previousnum==1){
                  return 1;
                }
                previousnum=i;
              }
              
            }
          return 0;
          }
          public static void main (String[] args){
                    
                      System.out.println(SquarePairs.isconsecutive(0));
                }
        }
        public class SquarePairs {
          public static int isTwinPrime(int a){
            int	status=1;
            for(int i=2;i<a;i++){
              if(a%i==0){
                status=0;
                break;
              }
            }
            return status;
          }
          public static int isPrime(int n){
            if (isTwinPrime(n)==0) {
              return 0;
            }
            if (isTwinPrime(n+2)==1 || isTwinPrime(n-2)==1) {
            return 1;
            }
            return 0;
               
            }
    
          
          public static void main (String[] args){
                    
                      System.out.println(SquarePairs.isPrime(9));
                }
        }
        
          
        public class SquarePairs {

          public static int  isZeroBalanced( int[] a){
            int status=0;
            int sum=0;
            for(int i=0;i<a.length; i++){ 
            sum=sum+a[i];
            if (sum!=0) {
              status=0;
              break;
            }
              else{
                
                for(int j=0;j<a.length;j++){
                  int counter=0;
                  for(int k=0;k<a.length;k++){
                    if (j!=k) {
                      if (a[j]==-(a[k])) {
                        counter++;
                      }
                    }
                    
                        }
                        if (counter!=0) {
                          status=0;
                          break;
                         }
                         
                       }
            
                        }
                      }
          
                       
                      return status;
                             
                             }
                             public static void main (String[] args){
                              int[] a=  {1,2,-1,-2}   ;
                               System.out.println(SquarePairs.isZeroBalanced(a));
                             }
                            }
                    
                    
        public class SquarePairs {

          public static int isCubePerfect(int[] a) {
            int status=0;
            if (a.length==0) {
              status=1;
            }
      
            for(int i=0;i<a.length; i++){
             status=0;
              for(int j=0;j<5; j++){
                int product=j*j*j;
                if (a[i]==product || a[i]==-(product) ){
                  status=1;
                  break;
                }
              }
          
            
           }
          
          
            return status;
                   
                   }
                   public static void main (String[] args){
                    int[] a={};
                     System.out.println(SquarePairs.isCubePerfect(a));
                   }
              }
           
        public class SquarePairs {

          public static int countOnes(int n) {
            int sum=0;
            while (n>0) {
              int x=n%2;
             
              sum=sum+x;
              n=n/2;
            }
          
          
            return sum;
                   
                   }
                   public static void main (String[] args){
                  
                     System.out.println(SquarePairs.countOnes(5));
                   }
              }
                  
          
        public class SquarePairs {

          public static int isDaphne(int[] a) {
            int oddCounter=0;
            int evenCounter=0;
            for(int i=0;i<a.length;i++){
              if (a[i]%2==0) {
                evenCounter++;
              }else if (a[i]%2!=0) {
                oddCounter++;
              }
            }
          if (oddCounter==a.length || evenCounter==a.length) {
            return 1;
          }
          
            return 0;
                   
                   }
                   public static void main (String[] args){
                  int[] a={6,8,12,4};
                     System.out.println(SquarePairs.isDaphne(a));
                   }
              }
                  
        public class SquarePairs {

          public static int isOdd(int[] n) {
            int status=0;
            for(int i=0;i<n.length;i++){
              if (n[i]%2!=0) {
               status=1;
               break;
              }
            }
            if (status==0) {
              return 0;
            }else{
               status=0;
              for(int k=0;k< n.length;k++){
                for(int j=0;j<n.length;j++){
                  if (k!=j) {
                    if (n[k]==n[j]) {
                      status=1;
                      break;
                    }

                  }
                }
              
              }
            }
            return status;
                   
                   }
                   
                    
                   public static void main (String[] args){
                  int[] n=   {2, 2, 2, 4, 4}   ;
                     System.out.println(SquarePairs.isOdd(n));
                   }
              }
                  
          
        public class SquarePairs {

          public static int isNormal(int n) {
            int status=1;
            for(int i=2;i<n;i++){
              if (n%i==0) {
                int factors=i;
                if (factors%2!=0) {
                  status=0;
                  break;
                }
              
            }
            }
            return status;
                   
                   }
                   public static void main (String[] args){
                  
                     System.out.println(SquarePairs.isNormal(32));
                   }
              }
        public class SquarePairs {
        
          public static int isAllPossiblities(int[] a) {
            int status=1;
            if (a.length==0) {
                status=0;
            }
            
            int counter=0;
            for(int i=0;i<a.length;i++){
             counter=0;
              for(int j=0;j<a.length;j++){
              if (i==a[j]) {
                counter++;
              }
            }
           
            if (counter==0) {
              status=0;
              break;
           
          }
          }
         
          
            return status;
                   
                   }
                   public static void main (String[] args){
                  int[] a=  {0,1,2}  ;
                     System.out.println(SquarePairs.isAllPossiblities(a));
                   }
              }
        public class SquarePairs {

          public static int isDigitSum(int n,int m) {
            if (n<0) {
              return -1;
            }
            int sum=0;
              while (n !=0) {
                int lastDigit=n%10;
                  
                sum=sum+lastDigit;
                n=n/10;
              }
             
                
             if (sum<m) {
              return 1;
             }
      
             
             
              return 0;
              
             }
              
          
             public static void main (String[] args){
              System.out.println(SquarePairs.isDigitSum(3, 3));
      
             }
            }
        public class SquarePairs {
        
          public static int isAllPossiblities(int[] a) {
            int status=1;
            if (a.length==0) {
                status=0;
            }
            
            int counter=0;
            for(int i=0;i<a.length;i++){
             counter=0;
              for(int j=0;j<a.length;j++){
              if (i==a[j]) {
                counter++;
              }
            }
           
            if (counter==0) {
              status=0;
              break;
           
          }
          }
         
          
            return status;
                   
                   }
                   public static void main (String[] args){
                  int[] a=  {0,1,2}  ;
                     System.out.println(SquarePairs.isAllPossiblities(a));
                   }
              }
        public class SquarePairs {

          public static int isEvens(int n) {
            
            int status=1;
              while (n !=0) {
                int lastDigit=n%10;
                  
               if(lastDigit%2!=0){
                status=0;
                break;
               }
                n=n/10;
              }
              return status;
              
             }
              
          
             public static void main (String[] args){
              System.out.println(SquarePairs.isEvens(3224));
      
             }
            }
             
        
        public class SquarePairs {

          public static int isMagicArray(int[] a) {
            
            int status=0;
            int sum=0;
              for(int i=0;i<a.length;i++){
                status=1;
                for(int j=2;j<a[i];j++){
                if (a[i]%j==0) {
                  status=0;
                  break;
                }
                }
                if (status==1) {
                  int prime=a[i];
                  sum=sum+a[i];
                  
                  
                }
              }
              for(int k=0;k<a.length;k++){
                if(sum==a[0]){
                  status=1;
                }else{
                  status=0;
                }
              }
             
              return status;
              
             }
              
          
             public static void main (String[] args){
              int[] a=   {8, 5, 5, 5, 3}  ;
              System.out.println(SquarePairs.isMagicArray(a));
      
             }
            }
        public class SquarePairs {

          public static int isCompleted(int[] a) {
            
            int status=1;
            int evenMin=a[0];
            int evenMax=a[0];
           
              for(int i=0;i<a.length;i++){
                if (a[i]%2==0) {
                  if (a[i]>evenMax) {
                    evenMax=a[i];
                  }else if (a[i]<evenMin) {
                    evenMin=a[i];
                  }
                }
                if (evenMin!=evenMax) {
                  for(int k=evenMin+1;k<evenMax;k++){
                  int counter=0;
                  for(int j=0;j<a.length;j++){
                    
                    
                      if (a[j]==k) {
                        counter++;
                        
                      }
                    }
                    if (counter==0) {
                      status= 0;
                    }
                  }
                 
                }
              }
              return status;
              
             }
              
          
             public static void main (String[] args){
              int[] a=  {2, 6, 3, 4}   ;
              System.out.println(SquarePairs.isCompleted(a));
      
             }
            }
            

        public class SquarePairs {

          public static int isPrimeProduct(int n){
            for(int i=2;i<n;i++){
              if(n%i==0){
                if(isPrime(i)==1){
                  for(int j=3;j<n;j++){
                    if(n%j==0){
                      if(isPrime(j)==1){
                        if(i*j==n){
                          return 1;
                        }
                      }
                    }
                  }
                }
              }
            }
            return 0;
          }
          public static int isPrime(int x){
            for(int i=2;i<x;i++){
              if(x%i==0){
                return 0;
              }
            }
            return 1;
          }
        
       
                   public static void main (String[] args){
                  
                     System.out.println(SquarePairs.isPrimeProduct(22));
                   }
              }
        public class SquarePairs {
        
          public static int isBalanced(int[] a) {
            int status=1;
            for(int i=0;i<a.length;i=i+2){
              if (a[i]%2!=0) {
                status=0;
                break;
                  }
            }
            for(int j=1;j<a.length;j=j+2){
              if (a[j]%2==0) {
                status=0;
                break;
                  }
            }
          
            return status;
          }
          
                 
                
                 public static void main (String[] args){
                int[] a=  {16, 6, 2, 3}    ;
                   System.out.println(SquarePairs.isBalanced(a));
                 }
            }
            public class SquarePairs {
        
              public static int isCentered(int[] a) {
                int status=1;
                if (a.length==0) {
                  status=0;
                  
                }
                
                for(int i=0;i<a.length;i++){
                  if (a.length%2==0) {
                    status=0;
                    break;
                  }
                  
                  else{
                    int centeredIndex=a.length/2;
                   if (i!=centeredIndex && a[centeredIndex]>=a[i]) {
                      status=0;
                      
                        }
                  } 
                
                }
              
                return status;
              }
              
                     
                    
                     public static void main (String[] args){
                    int[] a=     {5, 3, 1, 4, 5}      ;
                       System.out.println(SquarePairs.isCentered(a));
                     }
                }
            public class SquarePairs {
        
              public static boolean hasKSmallFactors(int b, int n) {
                boolean status=false;
                
                
                for(int i=2;i<n;i++){
                  if (isPrime(i)==1) {
               
                for(int k=3;k<n;k++){
                  if (isPrime(k)==1) {
                  }
                    
                    if (i*k==n && i<b && k<b) {
                      status=true;
                      
                    }
                
                }
              }
                  
                
                }
              
                return status;
              }
              public static int isPrime(int x){
                for(int i=2;i<x;i++){
                  if(x%i==0){
                    return 0;
                  }
                }
                return 1;
              }
                     
                    
                     public static void main (String[] args){
                   
                       System.out.println(SquarePairs.hasKSmallFactors(7, 30));
                     }
                }

            public class First {

              public static void main(String[] args) {
            
            System.out.println(isHollow(new int[] {1,2,0,0,0,3,4}));
            System.out.println(isHollow(new int[] {1,1,1,1,0,0,0,0,0,2,1,2,18}));
            System.out.println(isHollow(new int[] {1, 2, 0, 0, 3, 4}));
            System.out.println(isHollow(new int[] {1,2,0,0,0,3,4,5}));
            System.out.println(isHollow(new int[] {3,8,3,0,0,0,3,3}));
            System.out.println(isHollow(new int[] {1,2,0,0,0,3,4,0}));
            System.out.println(isHollow(new int[] {0,1,2,0,0,0,3,4}));
            System.out.println(isHollow(new int[] {0,0,0}));
            
              }
              static int isHollow(int[] a) {
            
            int count=a.length;
            int zerocount=0;
            int i;
            int j;
            int istart;
            int jstart;
            
            if(count%2==0){
             istart=(count/2)-1;
             jstart=count/2;
            }else{
             istart=count/2;
             jstart=count/2;
            }
              
            for(i=istart, j=jstart; i>=0; i--, j++){
             if(a[i]==0 && a[j]==0)
              zerocount++;
             else if(a[i]!=0 && a[j]!=0){
              break;
             }else{
              zerocount=0;
              break;
             }
            }
            
            if(zerocount>1)
             return 1;
            else
             return 0;
            
           }
          }
          public class SquarePairs {
        
            public static int waveArray(int[] a) {
              int status=1;
              for(int i=0;i<a.length-1;i=i+2){
                if (a[i]%2==0 && a[i+1]%2==0)  {
                  status=0;
                  break;
                    }else if (a[i]%2!=0 && a[i+1]%2!=0) {
                      status=0;
                  break;
                    }
              }
              return status;
              }
          
             
            
            
                   
                  
                   public static void main (String[] args){
                  int[] a=  {2, 6, 3, 4}    ;
                     System.out.println(SquarePairs.waveArray(a));
                   }
              }
          public class SquarePairs {
        
            public static int countDigit(int b,int n) {
              int counter=0;
         if (b<0) {
          return -1;
         }
         while (b!=0) {
          int last=b%10;
          if (last==n) {
            counter++;
          }
          b=b/10;
         }
              return counter;
        }
              
               public static void main (String[] args){
                  
                 System.out.println(SquarePairs.countDigit(323433533, 3));
               }
          }
        public class SquarePairs {
        
          public static int isBunkerArray(int[] a) {
            int status=0;
            
            
            for(int i=0;i<a.length-1;i++){
              
              if (a[i]%2!=0 && isPrime(a[i+1])==1) {
                status=1;
                break;
              }
            
            }
          
            return status;
          }
          public static int isPrime(int x){
            for(int i=2;i<x;i++){
              if(x%i==0){
                return 0;
              }
            }
            return 1;
          }
                 
                
                 public static void main (String[] args){
               int[] a=          {4, 9, 6, 15, 21}         ;
                   System.out.println(SquarePairs.isBunkerArray(a));
                 }
            }
        public class SquarePairs {
        public static int isMeera(int[] a){
          int status=1;
          for(int i=0;i<a.length;i++){
      
            for(int j=0;j<a.length;j++){
            if(a[i]*2==a[j]){
              status=0;
              break;
            }
          }
        }
          return status;
        }
               
              
               public static void main (String[] args){
             int[] a=          {8,3,4,5}         ;
                 System.out.println(SquarePairs.isMeera(a));
               }
              }
          
        public class SquarePairs {
          public static int isBunkerArray(int[] a){
            int status=0;
            for(int i=0;i<a.length;i++){
        if (isPrime(a[i])==1) {
          
          System.out.println(a[i]);
              for(int j=0;j<a.length;j++){
              if(a[j]==1){
                status=1;
                break;
              }
            }
            }
          }
            return status;
          }
          public static int isPrime(int x){
            if (x<2) {
              return 0;
            }
                for(int i=2;i<x;i++){
                  if(x%i==0){
                    return 0;
                  }
                }
                return 1;
              }  
                
                 public static void main (String[] args){
               int[] a=         {3,1, 4,21,12,15}          ;
                   System.out.println(SquarePairs.isBunkerArray(a));
                 }
                }
            
        public class SquarePairs {
          public static int isNiceArray(int[] a){
            int status=1;
            int counter=0;
            for(int i=0;i<a.length;i++){
        int add=a[i]+1;
        int sub=a[i]-1;
        status=0;
              for(int j=0;j<a.length;j++){
              if(add==a[j]|| sub==a[j]){
               status=1;
               break;
              }
            }
            if (status==0) {
              status=0;
              break;
            }
            
          }
            return status;
          }
         
                 public static void main (String[] args){
               int[] a=       {0,-1, 1}             ;
                   System.out.println(SquarePairs.isNiceArray(a));
                 }
                }
            
        public class SquarePairs {
          public static int  isContinuousFactored(int  n){
            int product=1;
            
            for(int i=1;i<n;i++){
              for(int j=i+1;j<n;j++){
                product=i*j;
                if (product==n) {
                  return 1;
                  
                }
                if (product>n) {
                  product=1;
                  break;
                }
              }

      
              
            
            
          }
            return 0;
          }
         
                 public static void main (String[] args){
                    
                   System.out.println(SquarePairs.isContinuousFactored(60));
                 }
                }
        public class SquarePairs {
          public static int  isTwin(int[] a){
          int status=0;
            
            for(int i=0;i<a.length;i++){
              if (isPrime(a[i])==1) {
                
            
              for(int j=0;j<a.length;j++){
              if (isPrime(a[j])==1) {
                if (a[j]-a[i]==2) {
                  status=1;
                  break;
                }
              }
              }
            }
            
          }
            return status;
          }
          public static int isPrime(int x){
                if (x<2) {
                  return 0;
                }
                    for(int i=2;i<x;i++){
                      if(x%i==0){
                        return 0;
                      }
                    }
                    return 1;
                  }  
         
                 public static void main (String[] args){
                    int[] a=      {3, 5, 8, 10, 27}             ;
                   System.out.println(SquarePairs.isTwin(a));
                 }
                }
        public class SquarePairs {
          public static int  isSetEqual(int[] a, int[] b){
          int status=0;
       
            
            for(int i=0;i<a.length;i++){
             
                status=0;
          
              for(int j=0;j<b.length;j++){
             
                if (a[i]==a[j]) {
                  status=1;
                  break;
               
                }
              
              
            }
       
            if (status==0) {
              status=0;
              break;
            }
            
          }
            return status;
          }
          public static void main (String[] args){
            int[] a=      {1, 7, 8}     ;
             int[] b=    {1,7,1}        ;
                         
            System.out.println(SquarePairs.isSetEqual(a, b));
          }
         }
         public class SquarePairs {
          public static int  isSmart(int n){
         
          int smart=1;
       
            
            for(int i=0;i<n;i++){
             
                smart=smart+i;
                System.out.println(smart);
          if (smart==n) {
        return 1; 
          
          }
             
       
            
          }
            return 0;
          }
          public static void main (String[] args){
                   
                         
            System.out.println(SquarePairs.isSmart(8));
          }
         }
        public class SquarePairs {
          public static int factorEqual(int n, int m){
            int counter=0;
            for(int i=1;i<n;i++){
             
              
          if (n%i==0) {
       counter++;
          
          }
             
       
            
          }
          int count=0;
            for(int i=1;i<m;i++){
             
              
          if (m%i==0) {
       count++;
          
          }
             
       
            
          }
          if (counter==count) {
            return 1;
          }
            return 0;
          }
          public static void main (String[] args){
                   
                         
            System.out.println(SquarePairs.factorEqual(33, 10));
          }
         }
      public class SquarePairs {
        public static int meera(int[] a){
          int status=1;
          int sum=0;
          for(int i=0;i<a.length;i++){
           
            if (a[i]>=i) {
         status=0;
         break;
            
            }else{
             
              sum=sum+a[i];
              System.out.println(sum);
            }
               
         
          }
         
          if (status==0) {
            status=0;
          }else{
if (sum==0) {
  status=1;
}else{
  status=0;
}
          }
            return status;
          }
          public static void main (String[] args){
                   int[] a=       { -4, 0, 1, 0, 2, 1}             ;
                         
            System.out.println(SquarePairs.meera(a));
          }
         }
public class SquarePairs {
  public static int  TripleArray(int[] a){
    int counter=0;
    int status=1;
    
    for(int i=0;i<a.length;i++){
      counter=0;
      for(int j=0;j<a.length;j++){
        
        if (a[i]==a[j]) {
          counter++;
          
        }
       
      }
      System.out.println(counter);
      if (counter!=3) {
        status=0;
        break;
      }

      
    
    
  }
    return status;
  }

         public static void main (String[] args){
            int[] a=            { 3,1, 1, 1}          ;
           System.out.println(SquarePairs.TripleArray(a));
         }
        }
public class SquarePairs {
  public static int isMeera(int [ ] a)
  {
  int status=1;
  int counter=0;
    
    for(int i=0;i<a.length;i++){
      if (isPrime(a[i])==1) {
        counter++;
      }
    }
    System.out.println(counter);
    if (counter==0) {
      for(int k=0;k<a.length;k++){ 
        if (a[k]==0) {
          status=0;
          break;
        } }  }
     else{
          for(int j=0;j<a.length;j++){ 
            if (a[j]==0) {
              status=1;
              break;
            }else{
              status=0;
            }
        }
      
        }
        
    
         
    return status;
    }
    public static int isPrime(int x){
          if (x<2) {
            return 0;
          }
              for(int i=2;i<x;i++){
                if(x%i==0){
                  return 0;
                }
              }
              return 1;
            }  
   
           public static void main (String[] args){
              int[] a=       { 7,6,0,  10, 1}              ;
             System.out.println(SquarePairs.isMeera(a));
           }
          }
public class SquarePairs {
  public static int  isFibonacci(int  n){
    
    int first=1;
    int second=1;
    int sum=0;
    while (sum<n) {
      sum=first+second;
      first=second;
      second=sum;
    
    }
    if (sum==n) {
      return 1;
    }
    return 0;
  }
 
         public static void main (String[] args){
            
           System.out.println(SquarePairs.isFibonacci(34));
         }
        }
public class SquarePairs {
  public static int  isFancy(int n){
    
    int first=1;
    int second=1;
    int product=1;
    while (product<n) {
      product=3*second+2*first;
      first=second;
      second=product;
     
    }
    if (product==n) {
      return 1;
    }
    return 0;
  }
 
         public static void main (String[] args){
            
           System.out.println(SquarePairs.isFancy(-80));
         }
        }
public class SquarePairs {
  public static int isBean(int[] a)
  {
      int isBean = 1;

      for (int i = 0; i < a.length; i++)
      {
          int isValid = 0;
          for (int j = 0; j < a.length; j++)
          {
              if (a[i] == 2 * a[j] || a[i] == 2 * a[j] + 1 || a[i] == a[j] / 2)
              {
                  isValid = 1;
                  break;
              }
          }
          if (isValid == 0)
              isBean = 0;
      }
      return isBean;
  }
  public static void main (String[] args){
     int[] a=         {4, 9, 8}                ;
    System.out.println(SquarePairs.isBean(a));
  }
 }
  public class SquarePairs {
public static int isDual(int[] a) {
  int status=0;
  if (a.length%2==0) {
    status=1;
    for(int i=2;i<a.length;i=i+2){
      if (a[0]+a[1]!=a[i]+a[i+1]) {
        status=0;
        break;
      }
    }
  }
  
           
            return status;
        }
        public static void main (String[] args){
          int[] a=         {1, 2, 1,2}               ;
         System.out.println(SquarePairs.isDual(a));
       }
      }
public class SquarePairs {
  public static int factorTwoCounts(int n) {
    int status=0;
    while (n%2==0) {
      if (n%2==0) {
      status++;
      }
      n=n/2;
    }
             
              return status;
          }
          public static void main (String[] args){
                         ;
           System.out.println(SquarePairs.factorTwoCounts(27));
         }
        }
public class SquarePairs {
  public static int goodSpread(int[] a) {
    int status=1;
   
    for(int i=0; i<a.length;i++){
      int counter=0;
      for(int j=0; j<a.length;j++){
        if (a[i]==a[j]) {
          counter++;
        }
      }
      if (counter>3) {
        status=0;
        break;
      }
    }
             
              return status;
          }
          public static void main (String[] args){
                 int [] a=        {3, 1, 3 ,1, 3, 5, 5, 3}         ;
           System.out.println(SquarePairs.goodSpread(a));
         }
        }
public class SquarePairs {
  public static int isAllEven(int[] a) {
    int status=1;
    if (a.length==0) {
      status=0;
    }else{
      for(int i=0; i<a.length;i++){
        if (a[i]%2!=0) {
          status=0;
          break;
        }
      }
           
    }
   
       
              return status;
          }
          public static void main (String[] args){
                 int [] a=        {8,6,9,4,2}         ;
           System.out.println(SquarePairs.isAllEven(a));
         }
        }
public class SquarePairs {
  static int findDistance(int n)
{   
    boolean isPrime=true;
    int returnvalue=0;

    if(n % 2==0)
    {   
        //If it is even there must be 2 and 1 as a factor therefore 2-1=1
        returnvalue=1;
    }
    else
    {
        for(int i=2;i<n;i++)
        {
            if(n % i==0)
            {   
                //if number is divisible by any except by 1 and itself
                //it is prime 
                isPrime=false;
                break;
            }
        }
        if(isPrime && n!=1)
        {   
            //If it is prime then return value should be n-1
            //since factor of prime are 1 and itself, so shortest distance
            //n-1
            returnvalue=n-1;
        }
        else
        {   
            //The problem is here if the number is not prime and is odd
            //since shortest distance differes now, for value divisible by 3 
            //it should be 3-1=2, but there are many other cases
            returnvalue=2;
        }
    }
    return returnvalue;
}
          public static void main (String[] args){
              System.out.println(SquarePairs.findDistance(93));
         }
        }
        public class SquarePairs {
          static int findDistance(int n)
        {   
            boolean isPrime=true;
            int returnvalue=0;
        
            if(n % 2==0)
            {   
                
                returnvalue=1;
            }
            else
            {
                for(int i=2;i<n;i++)
                {
                    if(n % i==0)
                    {   
                        
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime && n!=1)
                {   
                    
                    returnvalue=n-1;
                }
                else
                {   
                    
                    returnvalue=2;
                }
            }
            return returnvalue;
        }
                  public static void main (String[] args){
                      System.out.println(SquarePairs.findDistance(31));
                 }
                }
        public class SquarePairs {
          public static int isMeera(int n) {
            int status=0;
            int counter=0;
              for(int i=2; i<n;i++){
                if (n%i==0) {
                  System.out.println(i);
                 counter++;
                 
                }
              }
              for(int i=2; i<n;i++){
                if (n%i==0) {
                  int facors=i;
                 
                if (counter==i) {
                  status=1;
                  break;
                }
                 
                }
              }
              return status;
          }
          public static void main (String[] args){
                    
           System.out.println(SquarePairs.isMeera(21));
         }
        }
                   
            
           
               
        public class SquarePairs {
          public static int isOddHeavy(int[] a) {
            int status=1;
            int counter=0;
              for(int i=0; i<a.length;i++){
                if (a[i]%2==0) {
                  for(int j=0; j<a.length;j++){
                    if (a[j]%2!=0) {
                      if (a[i]>a[j]) {
                        status=0;
                        break;
                      }
                    }
                    
                }
              }
              if (status==0) {
                status=0;
                break;
              }

            }
            
               
                      return status;
                  }
                  
                  public static void main (String[] args){
                         int [] a=          {11,8,9,4,6}         ;
                   System.out.println(SquarePairs.isOddHeavy(a));
                 }
                }
        public class SquarePairs {
          public static int isNormal(int n) {
            int status=1;
           
              for(int i=2; i<n;i++){
                if (n%i==0) {
                  if (i%2!=0) {
                    status=0;
                  }
              }
              
            }
            
               
                      return status;
                  }
                  
                  public static void main (String[] args){
                      
                   System.out.println(SquarePairs.isNormal(10));
                 }
                }
        public class SquarePairs {
          public static boolean sumIsPower(int[] a) {
            boolean status=false;
           int sum=0;
              for(int i=0; i<a.length;i++){
                
              sum=sum+a[i];
            }
            
            int i=0;
           double checker=0;
            while (checker<sum) {
             
               checker=Math.pow(2, i);
              System.out.println(checker);
              if (checker==sum) {
                status=true;
              
              }
              i=i+1;
            }
            
            System.out.println("sum is" +" " +sum);
               
                      return status;
                      
                  }
                  
                  public static void main (String[] args){
                      int[] a=         {8,8,8}           ;
                   System.out.println(SquarePairs.sumIsPower(a));
                 }
                }
        public class SquarePairs {
          public static int isHallowArray(int[] a) {
            
           int status=1;
           if (a.length%2==0 || a[a.length/2]!=0) {
            status=0;
           }else{
            int countZero=0;
            for(int i=0; i<a.length;i++){
               if (a[i]==0) {
                countZero++;
               } 
              
            }
            System.out.println(countZero);
            if (countZero!=3) {
              status=0;
            }else{
              int beforMiddle=(a.length/2)-1;
              int afterMiddle=(a.length/2)+1;
              System.out.println(beforMiddle);
              System.out.println(afterMiddle);
              for(int j=0; j<a.length;j++){
                if (a[beforMiddle]!=0 || a[afterMiddle]!=0) {
                  status=0;
                  break;
                // }else{
                //   for(int k=0; k<beforMiddle;k++){
                //     if (a[k]==0) {
                //       status=0;
                //       break;
                //     }else{
                //       for(int l=a.length-1; l>afterMiddle;l--){
                //         if (a[l]==0) {
                //           status=0;
                //           break;
                //         }
                //       }
                //     }
                //   }
                }
               }
              }
              
            
          }
               
                      return status;
                      
                  }
                  
                  public static void main (String[] args){
                      int[] a=         {1,2, 0,0, 3,4}           ;
                   System.out.println(SquarePairs.isHallowArray(a));
                 }
                }
        public class SquarePairs {
          public static int isAscending(int[] a) {
            int status=1;
           int temp=0;
              for(int i=0; i<a.length;i++){
                for(int j=0; j<a.length;j++){
                  if (a[i]<a[j]) {
                     
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    System.out.println(temp);
                 }
                 
                  }
                 
                }
                return status;
            }
            
         
                     
                    
                  
                  public static void main (String[] args){
                      int[] a=            {4,3,2,7,5}                  ;
                   System.out.println(SquarePairs.isAscending(a));
                 }
                }
        public class SquarePairs {
          public static int isPascal(int n) {
            int status=0;
            int sum=0;
            int i=1;
              ////interms of economy we will use while loop.
              // for(int i=1; i<n;i++){
              //   sum=sum+i;
              //   System.out.println(sum);
              //   if (sum==n) {
              //     status=1;
              //     break;
              //   }
                 
              //   }
              while (sum<n) {
                sum=sum+i;
                System.out.println(sum);
                if (sum==n) {
                  status=1;
                  break;
                }
                i=i+1;
              }
                return status;
            }
            
         
                     
                    
                  
                  public static void main (String[] args){
                  
                   System.out.println(SquarePairs.isPascal(67));
                 }
                }
        public class SquarePairs {
          public static int[] isPairWise(int[] a) {
          int[] result= new int [a.length];
            for(int i=0, index=0; i<a.length-1 && index<result.length;i=i+2,index++){
              result[index]=a[i]+a[i+1];
              System.out.println(result[index]);
              }
            
              return result;
            }
            public static void main (String[] args){
            int[] a=           {5,2,4,8,4,9,8,8}              ;
             System.out.println(SquarePairs.isPairWise(a));
           }
          }
        public class SquarePairs {
          public static int isNextPerfect(int n) {
            int integer;
            if (n<0) {
              return 0;
            }else{
              double under=Math.sqrt(n);
              int cast=(int) under;
              int next=cast+1;
              double nextPer=Math.pow(next, 2);
                 integer=(int) nextPer;
            }
          
            
              return integer;
            }
            public static void main (String[] args){
                          ;
             System.out.println(SquarePairs.isNextPerfect(36));
           }
          }

        public class SquarePairs {
          static int nUpCount(int[] a, int n){
            int nUpCount = 0;
            int partialSum = 0;
            int previousPartialSum = 0;
            for(int i=0; i<a.length; i++){
              previousPartialSum = partialSum;
              partialSum += a[i];
              if(previousPartialSum <= n && partialSum > n){
                nUpCount++;
              }
            }
            return nUpCount;
          }
            public static void main (String[] args){
             int[] a=       {1, 2, -1, 5, 3, 2, -3}           ;
             System.out.println(SquarePairs.nUpCount(a,20));
           }
          }
        public class SquarePairs {
          public static int primeCount(int start, int end) {
           
            int counter=0;
              for(int i=start; i<=end;i++){
                if (isPrime(i)==1) {
               
                 counter++;
                 
                }
              }
              
             
              return counter;
          }
          public static int isPrime(int x){
                      if (x<2) {
                        return 0;
                      }
                          for(int i=2;i<x;i++){
                            if(x%i==0){
                              return 0;
                            }
                          }
                          return 1;
                        }  
          public static void main (String[] args){
                    
           System.out.println(SquarePairs.primeCount(6, 2));
         }
        }
        public class SquarePairs {
          public static int isPerfectSquare(int[] a) {
           
            int counter=0;
              for(int i=0; i<a.length;i++){
                int x=a[i];
                for(int j=0; j<a.length;j++){
                  int y=a[j];
              
                if (x<y && isPerfect(x+y)==1 && x>0 && y>0) {
               
                 counter++;
                }
                }
              }
              
             
              return counter;
          }
          public static int isPerfect(int n){
                     
                       double perfect=Math.sqrt(n);
                       int integer= (int)perfect;
                       if ((perfect-integer)==0) {
                        return 1;
                       }
                          return 0;
                        }  
          public static void main (String[] args){
                  int[] a=           {9}              ;  
           System.out.println(SquarePairs.isPerfectSquare(a));
         }
        }
      
        public class SquarePairs {
          public static int isInertial(int[] a) {
           int status=1;
            int counter=0;
            int max=a[0];
              for(int i=0; i<a.length;i++){
                if (a[i]>max) {
               max=a[i];
                
                }
              }
              System.out.println(max);
              if (isEven(max)==0) {
                status=0;
              }else{
                for(int j=0; j<a.length;j++){
                if (a[j]%2!=0) {
                  counter++;
                }
                }
              }
              System.out.println(counter);
             if (counter==0) {
              status=0;
             }else{
              int checker=0;
              for(int k=0; k<a.length;k++){
                if (isEven(a[k])==1) {
                  System.out.println(a[k]);
                  for(int m=0; m<a.length;m++){
                    if (isEven(a[m])==0) {
                      System.out.println(a[m]);
                      if (a[k]!=max && a[k]>a[m]) {
                        checker++;
                      }
                    }
                  }
                  
                }
                if (checker!=0) {
                  status=0;
                  break;
                }
              }
             }
              return status;
          }
          public static int isEven(int x){
                 if (x%2==0) {
                  return 1;
                 }     
                         
                          return 0;
                        }  
          public static void main (String[] args){
                int[] a=         {2}              ;    
           System.out.println(SquarePairs.isInertial(a));
         }
        }
        public class SquarePairs {
          public static int madeGuthrie(int n) {
                  while (n>1) {
                    if (n%2==0) {
                       n=n/2;
                    }else if (n%2!=0) {
                      n=n*3+1;
                    }
                    System.out.println(n);
                  }
            
                     
                      return n;
                  }
                  public static void main (String[] args){
                                  ;
                   System.out.println(SquarePairs.madeGuthrie(7));
                 }
                }
        public class SquarePairs {
          public static int isStantonMeasure(int[] a){
                  int counter=0;
                  int checker=0;
                  
                    for(int m=0; m<a.length;m++){
                      if (a[m]==1) {
                    counter++;
                      }
                      }
                      for(int i=0; i<a.length;i++){
                        if (counter==a[i]) {
                          checker++;
                        }
                        }
                  
            
                      return checker;
                  }
                  public static void main (String[] args){
                    int[] a=       {1, 4, 3,4,5,4,3,4,31,4,2, 1, 2,1, 3,
                      2,1}               ;              
                   System.out.println(SquarePairs.isStantonMeasure(a));
                 }
                }
        public class SquarePairs {
          public static int sumFactor(int[ ] a){
                  int counter=0;
                  int sum=0;
                  
                    for(int m=0; m<a.length;m++){
                      sum=sum+a[m];
                      }
                      for(int i=0; i<a.length;i++){
                        if (sum==a[i]) {
                          counter++;
                        }
                        }
                  
            
                      return counter;
                  }
                  public static void main (String[] args){
                    int[] a=    {1}             ;              
                   System.out.println(SquarePairs.sumFactor(a));
                 }
                }
            public class SquarePairs { 
              public static void main (String[] args){
                int[] sampleData=       {1,2,1,3,4,2,5}        ; 
                int[] result=removeDuplcate(sampleData);
                //after this if it is charcter or string data simply we will use system.out.println(sampleData) to show the result, but this is 
                // integer data,so we will use for loop to show the answer.
                for(int i=0;i<result.length;i++){
                  System.out.println(result[i]);
                }
          
        }
          public static int[] removeDuplcate(int[] givenArray) {
           if (givenArray==null || givenArray.length==0) {
            return givenArray;
           }else{
            int counter=0;
            boolean isDuplicate=false;
                int[] output=new int[givenArray.length];
                for(int i=0;i<givenArray.length;i++){
                  isDuplicate=false;
                  for(int j=0;j<output.length;j++){
                  if (givenArray[i]==output[j]) {
                    isDuplicate=true;
                          break;
                  }
                  }
                  if(isDuplicate==false){
                    output[counter]=givenArray[i];
                    counter++;
                  }
                  
                }
                if (counter==output.length) {
                  return output;
                }else{
                  int[] filteredOutput=new int[counter];
                  for(int x=0;x<filteredOutput.length;x++){
                  filteredOutput[x]=output[x];
                  }
                  return filteredOutput;
                }

              
           }
            
                     
                  
                  }
                  
                }
        public class SquarePairs {
          public static void main(String[] args){
          int[] sampleData=   {1,2,1,2,3}        ;
          int[] result=removeDuplicate(sampleData);
          for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
          }
          }
          public static int[] removeDuplicate(int[] a){
            int[] b=new int[a.length];
            if (a.length==0 || a==null) {
              return a;
            }else{
              int counter=0;
              boolean isDublicate=false;
              for(int i=0;i<a.length;i++){
                 isDublicate=false;
              for(int j=0;j<b.length;j++){
                if (a[i]==b[j]) {
                  isDublicate=true;
                  break;
                }
              }
              if (isDublicate==false) {
                b[counter]=a[i];
                counter++;
              }
              }
              if (counter==b.length) {
                return b;
              }else{
                int[] filtered=new int[counter];
                for(int k=0;k<filtered.length;k++){
                  filtered[k]=b[k];
                }
                return filtered;
                }
                
              }
            }
          }
        public class SquarePairs {
          public static void main (String[] args){
          int sample=-123;
          int result=reverse(sample);          
 System.out.println(String.valueOf(result));
}

          public static int reverse(int n){
                  int last=0;
                  if (n==0) {
                    return 0;
                  }else{
                    while (n!=0) {
           
                      last=(last*10)+n%10;
                    
                      n=n/10;
                    }
                   
                  }
                  
                  return last;
            
                      
                  }
                }
public class SquarePairs {
  public static void main (String[] args){
  int[] sample=          {1,2,3,4}    ;
  int result=sumOfEvenAndOdd(sample);          
System.out.println(result);
}

  public static int sumOfEvenAndOdd(int[] a){
          int oddSum=0;
          int evenSum=0;
          int diff=0;
          for(int i=0;i<a.length;i++){
              if (Even(a[i])==1) {
                evenSum=evenSum+a[i];
              }else{
                oddSum=oddSum+a[i];
              }
          }
          diff=oddSum-evenSum;
          
          return diff;
    
              
          }
          public static int Even(int n){
            if (n%2==0) {
              return 1;
            }
            return 0;
          }
        }
public class SquarePairs {
  

  public static int sumOfEvenAndOdd(int[] a, int n){
          int status=1;
          
          for(int i=0;i<a.length;i++){
              if (a[i]%n!=0) {
                status=0;
                break;
              }
          }
          
            return status;
          }
          public static void main (String[] args){
            int[] a=          {4,2,8,4}   ;
                     
          System.out.println(SquarePairs.sumOfEvenAndOdd(a, 2));
          }
          
        }
public class SquarePairs {
  

  public static int repsEqual(int[] a, int n){
          int status=1;
        
            
            for(int i=a.length-1;i>=0;i--){
              int last=n%10;
              n=n/10;
              if (a[i]!=last) {
                status=0;
                break;
              }
             
          }
          
          
          
          
          
            return status;
          }
          public static void main (String[] args){
            int[] a=          {4,2,8,0,4}   ;
                     
          System.out.println(SquarePairs.repsEqual(a, 42814));
          }
          
        }
public class SquarePairs {
  public static void main (String[] args){
    int[] sampleData=          {1,2,3,4,5,1,2}   ;
       int[] result=    removeDuplicate(sampleData);  
       for(int i=0; i<result.length;i++){
        System.out.println(result[i]);
       }   
 
  }
        public static int[] removeDuplicate(int[] a){   
          int[] b=new int[a.length];
                 int counter=0;
          boolean status=false;
          for(int i=0;i<a.length;i++){
            status=false;
            for(int j=0;j<b.length;j++){
            if (a[i]==b[j]) {
              status=true;
              break;
            }
            }
            if (status==false) {
              b[counter]=a[i];
              counter++;
            }
          }
          if (counter==a.length) {
            return b;
          }else{
            int[] filtered=new int[counter];
            for(int k=0;k<filtered.length;k++){
            filtered[k]=b[k];
            }
            return filtered;
          }
          }
          
           
         
        }
public class SquarePairs {
  public static void main (String[] args){
    int[] sample1=          {1,8,3,2,6}   ;
    int[] sample2=           {2,6,1}  ;
       int[] result=  common(sample1,sample2);  
       for(int i=0; i<result.length;i++){
        System.out.println(result[i]);
       }   
 
  }
        public static int[] common(int[] a, int[] b){  
        
          int[] e={};
       
          if (a.length==0||b.length==0) {
            return e;
          } else if (a==null  || b==null ) {
            return null;
          }else{
              int cSize;
              if (a.length>b.length) {
                cSize=b.length;
              }else{
                cSize=a.length;
              }
        
          int[] commons=new int[cSize];
          int counter=0;
          for(int i=0;i<a.length;i++){
          
            for(int j=0;j<b.length;j++){
            if (a[i]==b[j]) {
             commons[counter]=a[i];
             counter++;
            
            }
            }
          }
            if (counter==cSize) {
              return commons;
            }else{
              int[] filter=new int[counter];
              for(int x=0;x<filter.length;x++){
               filter[x]=commons[x];
              }
              return filter;
            }

          }}
        }
public class SquarePairs {
  public static void main(String[] args) {

      //  System.out.println(isPerfectSquare(8));
        //int[] a ={18, 9,28, 14,6}  ;
       int a[] = {8,4,2};
         //int a[] = {2, 7, 2, 2};
         System.out.println(isGuthrieSequence(a));

     }

      public static int isGuthrieSequence(int[] a) {
       int  status=1;
          if(a[a.length-1]!=1){
              return 0;
          }else{
            for (int i = 0; i < a.length-1 ; i++) {
              if (a[i] % 2 == 0) {
                int next=a[i]/2;
                  if (next != a[i + 1]) {
                      status= 0;
                      break;
                  }
              } else {
                int nextOdd=a[i]*3+1;
                  if (nextOdd != a[i + 1]) {
                      status= 0;
                      break;
                  }
              }
          }
          }



          
          return status;
      }
      
  }
  
public class SquarePairs {
  public static void main(String[] args) {

      //  System.out.println(isPerfectSquare(8));
      //int[] a = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}  ;
       int a[] = {0};
         //int a[] = {2, 7, 2, 2};
         System.out.println(stantonMeasure(a));

     }

      public static int stantonMeasure(int[] a)
      { 
        int status=1;
          int counter=0;
          int occure=0;
          for (int i = 0; i < a.length; i++) {
              if(a[i]==1){
                  counter++;
              }
          }
          
            for (int i = 0; i < a.length; i++) {
              if(counter==a[i]){
                  occure++;
              }
          }
          
          
         
         
         return occure;
      }
      
  }
public class SquarePairs {
  public static int sumFactor(int[ ] a){
          int counter=0;
          int sum=0;
          
            for(int m=0; m<a.length;m++){
              sum=sum+a[m];
              }
              for(int i=0; i<a.length;i++){
                if (sum==a[i]) {
                  counter++;
                }
                }
          
    
              return counter;
          }
          public static void main (String[] args){
            int[] a=    {10,20,0,30,-50,0,-5,-5}             ;              
           System.out.println(SquarePairs.sumFactor(a));
         }
        }
public class SquarePairs {
       
  public static int convertToBase10(int[ ] a, int n){ 
             
              int sum=0;
              
              for(int j=0;j<a.length;j++){
              
                   double pow=Math.pow(n, a.length-1-j);
                   int prod=(int)pow*a[j];
                   sum=sum+prod;
                  
              }
             

              return sum ;
          }
        
          
      
  

  public static void main(String[] args) {

int a[] =  {3, 2, 5} ;
         System.out.println(SquarePairs.convertToBase10(a, 8));

     }

  
}
public class SquarePairs {
public static int isNUnique(int[] a, int n){ 
   int status=1;          
  int counter=0;
  
  for(int i=0;i<a.length;i++){
    for(int j=0;j<a.length;j++){
      if (a[i]+a[j]==n) {
        counter++;
      }
    }
    
  }
  if (counter!=2) {
    status=0;
    
  }
  return status ;
}
public static void main(String[] args) {

int a[] = {7, 3, 3, 2, 4}  ;
System.out.println(SquarePairs.isNUnique(a, 4));
}
}


public class SquarePairs {
  public static int isSquare(int n){ 
     int status=0;          
    int product=0;
    int i=0;
    while (product<n) {
      product=i*i;
      if (product==n) {
        status=1;
        break;
      }
      i++;
      System.out.println(product);
    }
    
    return status ;
    
  }
  public static void main(String[] args) {
  
  System.out.println(SquarePairs.isSquare(10));
  }
  }
public class SquarePairs {
  public static int isLegalNumber(int[] a, int n){ 
     int status=1;          
   
    
    for(int i=0;i<a.length;i++){
      if (a[i]>=n) {
        status=0;
        break;
      }
    }
    
    return status ;
  }
  public static void main(String[] args) {
  
  int a[] =  {3, 7, 1}  ;
  System.out.println(SquarePairs.isLegalNumber(a, 6));
  }
  }
public class SquarePairs {
  public static int isSquare(int n){ 
     int status=0;          
    int sum=0;
    int i=1;
    while (sum<n) {
      sum=sum+i;
      if (sum==n) {
       status=1;
       break; 
      }
      i++;
      System.out.println(sum);
    }
    
    return status ;
    
  }
  public static void main(String[] args) {
  
  System.out.println(SquarePairs.isSquare(7));
  }
  }
public class SquarePairs {
  public static int nonZero(int[] a){ 
     int status=1;          
    
    if (a.length==0) {
      status=1;
    }else{
      for(int i=0;i<a.length;i++){
      if (a[i]==0) {
        status=0;
        break;
      }
      }
    }
    
    
    return status ;
  }
  public static void main(String[] args) {
  
  int a[] = {}  ;
  System.out.println(SquarePairs.nonZero(a));
  }
  }


public class SquarePairs {
  public static int sumSafe(int[] a){ 
     int status=1;          
    int sum=0;
    for(int j=0;j<a.length;j++){
      sum=sum+a[j];
      }
    
      for(int i=0;i<a.length;i++){
      if (a[i]==sum) {
        status=0;
        break;
      }
      }
    
    
    
    return status ;
  }
  public static void main(String[] args) {
  
  int a[] =  {5, -2, 1}   ;
  System.out.println(SquarePairs.sumSafe(a));
  }
  }
public class SquarePairs {
  public static int isIsolated(long n){ 
     int status=1;          
   long square=n*n;
   long cube=n*n*n;
    while (square!=0) {
     long lastSquare=square%10;
     while (cube!=0) {
     long lastCube=cube%10;
     if (lastSquare==lastCube) {
      status=0;
      break;
     }
     cube=cube/10;
    }
    if (status==0) {
      status=0;
      break;
    }
    square=square/10;
    }
    
    return status ;
    
  }
  public static void main(String[] args) {
  
  System.out.println(SquarePairs.isIsolated(58));
  }
  }
public class SquarePairs {
  public static int isVanilla(int[] a){ 
     int status=1;          
    int last=a[0]%10;
    for(int i=0;i<a.length;i++){
    int checker=a[i];
    while (checker!=0) {
      int anotherlast=checker%10;
      if (last!=anotherlast) {
        status=0;
        break;
      }
      checker=checker/10;
    }
    if (status==0) {
      status=0;
       break;
    }
    }
    return status ;
  }
  public static void main(String[] args) {
  
  int a[] =  {11, 22, 13, 34, 125}    ;
  System.out.println(SquarePairs.isVanilla(a));
  }
  }

public class SquarePairs {
  public static int mostOccurance(int[] a){ 
   
     int counter=0;          
    int max=0;
    //int element=a[0];
    int temp=0;
    
      for(int i=0;i<a.length;i++){
      counter=0;
        for(int j=0;j<a.length;j++){
          
            if (a[i]==a[j]) {
              counter++;
            
            }
              }
              if (counter>max) {
                max=counter;
                temp=a[i];
              }
            }
          
            int counterer=0;
   
   
            for(int i=0;i<a.length;i++){
            counterer=0;
              for(int j=0;j<a.length;j++){
                
                  if (a[i]==a[j]) {
                    counterer++;
                  
                  }
                    }
                    if (max==counterer) {
                      element=a[i];
                      break;
       
                    }
                  }
      
    
    
    return temp;
  }
 
  public static void main(String[] args) {
  
  int a[] =  {5, 2,2, 1,21,6,12,6,1,6,7,8,9}   ;
  System.out.println(SquarePairs.mostOccurance(a));
  }
  }
  public class SquarePairs {
    public static int largestPrimeNumber(int n){ 
      int max=0;         
    
      
        for(int i=2;i<n;i++){
        if (n%i==0) {
          if (isPrimeNumber(i)==1) {
            if (max<i) {
              max=i;
            }
          }
        }
        }
      
      
      
      return max ;
    }
    public static int isPrimeNumber(int a){ 
      int status=1;        
    
      
        for(int i=2;i<a;i++){
        if (a%i==0) {
          status=0;
          break;
        }
        }
      
      
      
      return status ;
    }
    public static void main(String[] args) {
    
    int a[] =  {5, -2, 1}   ;
    System.out.println(SquarePairs.largestPrimeNumber(15460456));
    }
    }
  public class SquarePairs {
    public static int henry(int i, int j){ 
     
      int counter=0; 
      
      int sumh=0;
      
      int max=Integer.MAX_VALUE;       
      for(int m=1;m<=max;m++){
        int sum=0;
        for(int k=1;k<m;i++){

          if (m%k==0) {
            sum=sum+k;
          }
        }
        if (sum==m) {
          counter++;
          if (counter==i) {
            sumh=sumh+sum;
          }else if (counter==j) {
            sumh=sumh+sum;
            break;
          }
        }
      }
      
      return sumh ;
    }
   
      public static void main(String[] args) {
      
    
      System.out.println(SquarePairs.henry(1, 3));
      }
      }
      public class SquarePairs {
        public static int isSquantialBounded(int[] a){ 
           int status=1;          
           int element=a[0];
           int counter=0;
           for(int i=1;i<a.length;i++){
           if (element==0||element==1||a[i]==0||a[i]==1) {
             status=0;
             break;
           }else if (element==a[i]) {
             counter++;
           }else if (counter>element) {
             status=0;
             break;
           }else if (element>a[i]) {
             status=0;
             break;
           }
           element=a[i];
           counter=0;
           }
           return status ;
         }
         public static void main(String[] args) {
         
         int a[] = {}    ;
         System.out.println(SquarePairs.isSquantialBounded(a));
         }
         }
      public class SquarePairs {
        public static int isAscendingOrder(int[] a){ 
           int status=1;
           int element=a[0];
           for(int i=0;i<a.length;i++){
            if (element>a[i]) {
              status=0;
              break;
            }
            element=a[i];
           }
           return status ;
         }
         public static void main(String[] args) {
         
         int a[] = {1,4,67,636,989}    ;
         System.out.println(SquarePairs.isAscendingOrder(a));
         }
         }
      public class SquarePairs {
        public static int largestAdjecentSum(int[] a){ 
          
          int sum=0;
          int max=a[0];
          for(int i=0;i<a.length-1;i++){
                sum=a[i]+a[i+1];
                if (max<sum) {
                  max=sum;
                }
          }
           return max ;
         }
         public static void main(String[] args) {
         
         int a[] = {18,-12,9,-10}    ;
         System.out.println(SquarePairs.largestAdjecentSum(a));
         }
         }
      public class SquarePairs {
        public static int isCubePower(int n){ 
          
          int sum=0;
          int status=0;
          int c=n;
          if (c==0) {
            status=0;
          }else{while (c>0) {
            int last=c%10;
            double cube=Math.pow(last, 3);
            int change=(int )cube;
            sum=sum+change;
            c=c/10;
            System.out.println(sum);
          }
          if (sum==n) {
            status=1;
          }}
          
           return status;
         }
         public static void main(String[] args) {
         
         
         System.out.println(SquarePairs.isCubePower(0));
         }
         }
      public class SquarePairs {
        public static int isDual(int[] a){ 
          
          int status=1;
          int counter=0;
          for(int i=0;i<a.length;i++){
                counter=0;
                for(int j=0;j<a.length;j++){
                if (a[i]==a[j]) {
                  counter++;
                }
                }
                if (counter!=2) {
                  status=0;
                  break;
                }
          }
           return status ;
         }
         public static void main(String[] args) {
         
         int a[] = {3,1,1,2,2}    ;
         System.out.println(SquarePairs.isDual(a));
         }
         }
      public class SquarePairs {

            public static int isPairedN( int n) {
                int status=0;
             if (n<0) {
                status=0;
             }else{
            int factor=0;
            int counter=0;
                for(int i=2;i<n; i++){
                   if (n%i==0) {
                    factor=i;
                    for(int j=2;j<factor; j++){
                      if (factor%i==0) {
                       counter++;
                      }
                   }
                   if (counter==0) {
                    status=0;
                  }else{
                    status=1;
                  }
                  
                    }
                }
                


             }
             
           
              
            
              return status;
                     
                     }
                     public static void main (String[] args){
                      
                       System.out.println(SquarePairs.isPairedN(-27));
                     }
                }
      public class SquarePairs {

        public static int isPairedN( int[] a) {
            int status=1;
       
        
            for(int i=0;i<a.length; i=i+2){
               if (a[i]%2==0) {
                status=0;
                break;
                
               }
              }
              for(int j=1;j<a.length; j=j+2){
                if (a[j]%2!=0) {
                 status=0;
                 break;
                 
                }
               }
              return status;
                     
                     }
                     public static void main (String[] args){
                      int[] a= {7,4,5,6,10,8};
                       System.out.println(SquarePairs.isPairedN(a));
                     }
                }
      public class SquarePairs {

        public static int isOddHeavy( int[] a) {
            int status=1;
            int counter=0;
       
        
            for(int i=0;i<a.length; i++){
               if (isOdd(a[i])==1) {
                counter++;
               }
              }
              if (counter==0) {
                status=0;
              }else{
                int max=a[0];
                for(int j=0;j<a.length; j++){
                  if (max<a[j]) {
                  max=a[j];
                  
                  }
                  if (max%2==0) {
                    status=0;
                     break;
                 }else if (isOdd(j)==0) {
                  int even=a[j];
                  
                  }else{
                    int odd=a[j];
                    
                  }
                  if (odd<even) {
                      status=0;
                      break;
                    }
                  
                }
                
                 
                   }
                   
                 
              
             
              return status;
                     
                     }
                    

                      public static int isOdd( int n) {
                          if (n%2==0) {
                            return 0;
                          }
                          return 1;
                          
                 }
            public static void main (String[] args){
           int[] a={11,80,9,2,4};
              System.out.println(SquarePairs.isOddHeavy(a));
            }
       }
