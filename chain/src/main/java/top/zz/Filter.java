package top.zz;

public interface Filter {
    void doFilter(Request request,Response response,FilterChain chain);
}
