import static org.junit.Assert.*;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
 @Test
    public void getLinksTester() throws IOException {
        path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<string> links = MarkdownParse.getLinks(contents);
        assertEquals("Error", new ArrayList<string>(List.of("https://something.com","some-page.html")),links);
    }
    
    }