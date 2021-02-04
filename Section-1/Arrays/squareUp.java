public int[] squareUp(int n) 
{
  int len=n*n;
  int[] result=new int[len];
  if(n==0)
  {
    return result;
  }
  result[n-1]=1;
  for(int i=1;i<=n-1;i++)
  {
    for(int j=0;j<=n-1;j++)
    {
      result[n*i+j]=result[n*(i-1)+j];
    }
    result[(n*i)+(n-i-1)]=i+1;
  }
  return result;
}