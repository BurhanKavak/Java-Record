public record PersonRecord(String name, String email) {


    @Override
    public String email() {
        return "abc";
    }
}
