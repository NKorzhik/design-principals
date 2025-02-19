package dp.creational.simplefactory;

/**
 * This class acts as a simple factory for creation of different posts on website.
 */
public class PostFactory {

    public static Post createPost(String type) {
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Invalid post type");
        };
    }
}
