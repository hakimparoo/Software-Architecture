package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter getBookMetadataFormatter() throws IOException {
        return new CSVBookMetadataFormatter();
    }
}
