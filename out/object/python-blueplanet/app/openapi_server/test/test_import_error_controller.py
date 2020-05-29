# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.import_error import ImportError  # noqa: E501
from app.openapi_server.models.import_error_collection import ImportErrorCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestImportErrorController(BaseTestCase):
    """ImportErrorController integration test stubs"""

    def test_delete_import_error(self):
        """Test case for delete_import_error

        Delete an import error
        """
        response = self.client.open(
            '/api/v1/importErrors/{import_error_id}'.format(import_error_id=56),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_import_error(self):
        """Test case for get_import_error

        Get an import error
        """
        response = self.client.open(
            '/api/v1/importErrors/{import_error_id}'.format(import_error_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_import_errors(self):
        """Test case for get_import_errors

        Get all import errors
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        response = self.client.open(
            '/api/v1/importErrors',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
