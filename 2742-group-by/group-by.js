/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    const result = {};

    for (const item of this) {
        const key = fn(item); // get the group key
        if (!result.hasOwnProperty(key)) {
            result[key] = [];
        }
        result[key].push(item); // add item to the corresponding group
    }

    return result;
};

/**
 * Example:
 * [1, 2, 3].groupBy(String) // returns {"1": [1], "2": [2], "3": [3]}
 */
