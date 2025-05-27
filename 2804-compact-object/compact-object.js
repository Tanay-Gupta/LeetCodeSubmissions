/**
 * Removes all falsy values from an object or array, including nested structures.
 * @param {Object|Array} obj - The object or array to clean.
 * @return {Object|Array} - The cleaned object or array.
 */
var compactObject = function(obj) {
    // Initialize the result as an array or object depending on input
    const result = Array.isArray(obj) ? [] : {};

    // Loop through each key/index in the object or array
    for (const key in obj) {
        let value = obj[key];

        // If value is an object (and not null), recursively clean it
        if (value && typeof value === "object") {
            value = compactObject(value);
        }

        // Only add the value if it's not falsy (e.g., not false, null, 0, "", undefined, NaN)
        if (value) {
            if (Array.isArray(obj)) {
                result.push(value); // Push to array
            } else {
                result[key] = value; // Add to object
            }
        }
    }

    return result;
};
