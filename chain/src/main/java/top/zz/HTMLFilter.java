package top.zz;

//�����ַ����е�HTML���
public class HTMLFilter implements Filter {

  public void doFilter(Request request, Response response,FilterChain chain) {
      //���ַ����г��ֵ�"<>"�����滻��"[]"
      request.requestStr=request.requestStr
              .replace('<', '[').replace('>', ']')+
              //������ӵ��Ǳ������ǹ۲����ִ�в�����ַ���
              "----HTMLFilter()";
      chain.doFilter(request, response,chain);
      response.responseStr+="---HTMLFilter()";
  }

}