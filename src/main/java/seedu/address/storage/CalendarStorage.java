package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyCalendar;

/**
 * Represents a storage for {@link seedu.address.model.Calendar}.
 */
public interface CalendarStorage {

    /**
     * Returns the file path of the data file.
     */
    Path getCalendarFilePath();

    /**
     * Returns AddressBook data as a {@link ReadOnlyCalendar}.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<ReadOnlyCalendar> readCalendar() throws DataConversionException, IOException;

    /**
     * @see #getCalendarFilePath()
     */
    Optional<ReadOnlyCalendar> readCalendar(Path filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyCalendar} to the storage.
     * @param calendar cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveCalendar(ReadOnlyCalendar calendar) throws IOException;

    /**
     * @see #saveCalendar(ReadOnlyCalendar)
     */
    void saveCalendar(ReadOnlyCalendar calendar, Path filePath) throws IOException;


}
