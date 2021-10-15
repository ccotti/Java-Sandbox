package Section5_Projects;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Chris Cottingham");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(6, "Edward ");
        System.out.println(sb);

        sb.replace(27, 37, "amazing");
        System.out.println(sb);

        sb.delete(5, 12);
        System.out.println(sb);

    }
}
