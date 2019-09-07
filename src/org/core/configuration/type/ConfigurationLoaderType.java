package org.core.configuration.type;

import org.core.utils.Identifable;

public interface ConfigurationLoaderType extends Identifable {

    String[] acceptedFileExtensions();
}
