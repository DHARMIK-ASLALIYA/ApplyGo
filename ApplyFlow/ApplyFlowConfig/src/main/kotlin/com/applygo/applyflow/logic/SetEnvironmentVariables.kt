/**
 * ====================================================================
 * Project: ApplyFlow Config Server
 * Description: This class is responsible for loading environment variables
 *              from a .env file and setting them as system properties.
 *              It utilizes the dotenv-kotlin library to retrieve key-value
 *              pairs from the .env file and apply them globally.
 * ====================================================================
 */

package com.applygo.applyflow.logic

import io.github.cdimascio.dotenv.dotenv

class SetEnvironmentVariables {

    fun setENV() {
        System.getProperties().putAll(dotenv().entries().associate { it.key to it.value })
    }

}
