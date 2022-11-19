class Solution:
    def dataTypeSize(self, str):
        # Code here
        data_types= {"Character":1, "Integer":4, "Float": 4, "Double": 8, "Long": 8}

        if str in data_types:
            return data_types.get(str)
