package api;

public class Request
{
    private String label;
    private String body;

    public Request(String label,String body)
    {
        this.label = label;
        this.body = body;
    }

    public String getLabel()
    {
        return label;
    }

    public String getBody()
    {
        return body;
    }
}
