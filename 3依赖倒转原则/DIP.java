interface IReader{  
    public String getContent();  
}  

class Newspaper implements IReader {  
    public String getContent(){  
        return "林书豪17+9助尼克斯击败老鹰……";  
    }  
}  
class Book implements IReader{  
    public String getContent(){  
        return "很久很久以前有一个阿拉伯的故事……";  
    }  
}  
  
class Mother{  
    public void narrate(IReader reader){  
        System.out.println("妈妈开始讲故事");  
        System.out.println(reader.getContent());  
    }  
}  
  
public class DIP{  
    public static void main(String[] args){  
        Mother mother = new Mother();  
        mother.narrate(new Book());  
        mother.narrate(new Newspaper());  
    }  
}  
