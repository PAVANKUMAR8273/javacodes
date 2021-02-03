class Image 
{
	double size;
	Image(double size)
	{
		this.size=size;
	}
	public void getsize(double size)
	{
		System.out.println("Image size is :"+size);
	}
}
class Video 
{
	double duration;
	Video(double duration)
	{
		this.duration=duration;
	}
	public void getduration(double duration)
	{
		System.out.println("Video duration is :"+duration);
	}
}
class Server 
{
	public void upload(Object obj)    //upcasting
	{
		if(obj instanceof Image)
		{
			Image img=(Image)obj;     // downcasting
			double size=img.size;
			if(size<10)
			{
				System.out.println("Image uploaded..");
				System.out.println("image size :"+size);
			}
			else
			{
				System.out.println("Image upload failed : Image size exceeded the limit..");
			}
		}
		else
		{
			Video vd=(Video)obj;       // downcasting
			double dur=vd.duration;
			if(dur<10)
			{	
				System.out.println("Video uploaded..");
				System.out.println("video duration :"+dur);
			}
			else
			{
				System.out.println("Video upload failed : Video duration exceeded the limit..");
			}
		}
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		Server s1 = new Server();
		Image i1 = new Image(2.5);
		s1.upload(i1);
		Video v1 = new Video(10);
		s1.upload(v1);
		
		
	}
}