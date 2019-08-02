<%!
    public String name = "Raj kumar";
	private int age = 78;
	
	{
		System.out.println("Inside My Block");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getName(String name) {
		return "Given name is :-" + name;
	}
%>
<!DOCTYPE html>
<html>
<body>
    <h1>JSP Tags Example</h1>
    <BR><BR>
     Name 1 : <%= name %><BR>
     Name 2 : <%= getName() %><BR>
     Name 3 : <%= getName("Nag") %><BR>
     Age 1 :  <%= age %> <BR>
     Age 2 :  <%= getAge() %><BR><BR>
     
     <%
          for(int i=0;i<5;i++){
        	  
     %>
       
       Name : <%=name%><BR>
       <%
          }
       %>
      
    
</body>
</html>