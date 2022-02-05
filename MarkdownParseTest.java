import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
 @Test
    public void getLinksTester() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals("Error", new ArrayList<String>(List.of("https://something.com","some-page.html")),links);
    }
 @Test
 public void failTest() throws IOException
        String contents = Files.readString(Path.of("test-file.md"));
        assertEquals(List.of("fail test","some-page.html");
        MarkdownParse.getLinks(contents);
    }