// java code

public class Main
{
	public static void main(String[] args) {
		int n=5;
		int i,j;
		//Increasing pattern- star
// 		for(i=0;i<n;i++){
// 		    for(j=0;j<=i;j++){
// 		        System.out.print("* ");
// 		    }
// 		    System.out.println();
// 		}
        // Decreasing pattern -star
//         	for(i=0;i<n;i++){
// 		    for(j=i;j<n;j++){
// 		        System.out.print("* ");
// 		    }
// 		    System.out.println();
// 		}
        //right sided triangle  using (Decreasing-space and increasing-stars)
//         	for(i=0;i<n;i++){
//         	    for(j=i;j<n;j++){
//         	        System.out.print("  ");
//         	    }
// 		    for(j=0;j<=i;j++){
// 		        System.out.print("* ");
// 		    }
// 		    System.out.println();
// 		}
		//right sided triangle using (increasing-space and Decreasing-stars)
// 		for(i=0;i<n;i++){
// 		    for(j=0;j<=i;j++){
// 		        System.out.print("  ");
// 		    }
// 		    for(j=i;j<n;j++){
// 		        System.out.print("* ");
// 		    }
		    
// 		    System.out.println();
// 		}
        //Hill pattern using (Decreasing-space, increasing-stars and increasing-stars)
        // for(i=0;i<n;i++){
        //     for(j=i;j<n;j++){
        //         System.out.print("  ");
        //     }
        //     for(j=0;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(j=0;j<i;j++){
        //         System.out.print("* ");
                
        //     }
        //     System.out.println();
        // }
        // Reverse Hill pattern using (increasing-space, Decreasing-stars and Decreasing-stars )
  
        //  for(i=0;i<n;i++){
             
        //     for(j=0;j<=i;j++){
        //         System.out.print("  ");
        //     }
        //     for(j=i;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     for(j=i;j<n-1;j++){
        //         System.out.print("* ");
                
        //     }
        //     System.out.println();
        // }
        
        // Diamond pattern using (Hill pattern and Reverse Hill pattern)
            for(i=0;i<n+1;i++){
            for(j=i;j<n;j++){
                System.out.print("  ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(j=0;j<i;j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
              for(i=0;i<n;i++){
             
            for(j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(j=i;j<n;j++){
                System.out.print("* ");
            }
            for(j=i;j<n-1;j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
	}
}
