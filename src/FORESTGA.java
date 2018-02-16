import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/FORESTGA
 */ 
class FORESTGA {
    static IO io = new IO();
    static int MOD = (int) 1e9 + 7;

    public static void main(String[] args) throws Exception {
        int n = io.getInt();
        long w = io.getInt(), l = io.getInt();
        List<int[]> ts = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ts.add(new int[]{io.getInt(), io.getInt()});
        }
        long low = 0, high = (long)(1e18 + 1);
        while (low < high){
            long mid = (low + high) / 2;
            if(canDo(ts, mid, w, l))
                high = mid;
            else
                low = mid + 1;
        }
        System.out.println(low);
    }

    public static boolean canDo(List<int[]> ts, long days, long w, long l){
        long sum = 0;
        for(int[] t: ts){
            long h = t[0], r = t[1];
            long last = h + r*days;
            if(last >= l)
                sum += last;
            if(sum >= w)
                return true;
        }
        return sum >= w;
    }
}

class IO {
    private BufferedReader br = null;
    private StringTokenizer st = null;

    public IO() {
        this(System.in);
    }

    public IO(InputStream is) {
        this.br = new BufferedReader(new InputStreamReader(is));
    }

    public List<String> getStringArray(int n) throws IOException {
        if (n == 0)
            return new ArrayList<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(getString());
        }
        return res;
    }

    public String getString() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    public <T> T getCustom(Function<String, T> f) throws IOException {
        return f.apply(getString());
    }

    public <T> List<Object> getCustomList(int n, Function<String, T> f) throws IOException {
        List<String> stringList = getStringArray(n);
        return stringList.stream().map(f).collect(Collectors.toList());
    }

    public List<Integer> getIntegerArray(int n) throws IOException {
        if (n == 0)
            return new ArrayList<>();
        List<String> res = getStringArray(n);
        return res.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    public Integer getInt() throws IOException {
        List<Integer> res = this.getIntegerArray(1);
        return res.size() == 0 ? 0 : res.get(0);
    }
}
