package top.zz;

//����Ĺ����������۵Ĺ��˹���
public class SensitiveFilter implements Filter{

  public void doFilter(Request request, Response response,FilterChain chain) {
      //�����ַ����е�������Ϣ��������ҵ��г�ɾ�ҵ
      request.requestStr=request.requestStr
              .replace("����ҵ", "��ҵ").replace("����", "")+
              //�������ӵ��Ǳ������ǹ۲����ִ�в�����ַ���
              " ---sensitiveFilter()";
      chain.doFilter(request, response,chain);
      response.responseStr+="---sensitiveFilter()";
  }

}