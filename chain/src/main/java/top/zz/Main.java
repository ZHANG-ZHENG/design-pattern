package top.zz;

/*
 * ������ģʽ��
 * ������Ϣ�ڽ������ݿ�֮ǰ��Ҫ�����ֹ��˹�����д������ֹ����γ�һ���������δ���
 * ������������Ϣ
 */
public class Main {
    public static void main(String args[]) {
        //�趨���˹��򣬶�msg�ַ������й��˴���
        String msg = ":):,<script>,����,����ҵ,�����ڿ�";
        //��������
        Request request=new Request();
        //set���������������ַ������ݽ�ȥ
        request.setRequest(msg);
        //������̽�������������Ӧ
        Response response=new Response();
        //������Ӧ��Ϣ
        response.setResponse("response:");
        //FilterChain,���˹����γɵ���������
        FilterChain fc=new FilterChain();
        //����������ӹ��˹��򣬲��õ�����ʽ����
        fc.addFilter(new HTMLFilter())
        .addFilter(new SensitiveFilter());
        //����FilterChain�Ĺ���˳������Ӧ�ù��˹���
        fc.doFilter(request, response,fc);
        //��ӡ������Ϣ
        System.out.println(request.getRequest());
        //��ӡ��Ӧ��Ϣ
        System.out.println(response.getResponse());
        /*
         * �����������ݽ��д���
         * --|----|---����--|-----|--- 
         * ����1      ����2                 ����3       ����4
         */
    }
}