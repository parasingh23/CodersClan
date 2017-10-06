<%
    String value = request.getParameter("value");
    int flag=0;
    
    for(int i=0;i<value.length(); i++)
    {
        char c = value.charAt(i);
        if( (c>=48 && c<=57) || (c>=65 && c<=90) || (c>=97 && c<=122))
        {
            flag=0;
        }
        else
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    {
        %>
        Not Valid
        <%
    }
    
    
    
    %>