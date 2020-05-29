# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.connection import Connection  # noqa: E501
from app.openapi_server.models.connection_collection import ConnectionCollection  # noqa: E501
from app.openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConnectionController(BaseTestCase):
    """ConnectionController integration test stubs"""

    def test_create_connection(self):
        """Test case for create_connection

        Create connection entry
        """
        body = null
        response = self.client.open(
            '/api/v1/connections',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_connection(self):
        """Test case for delete_connection

        Delete a connection entry
        """
        response = self.client.open(
            '/api/v1/connections/{connection_id}'.format(connection_id=56),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_connection(self):
        """Test case for get_connection

        Get a connection entry
        """
        response = self.client.open(
            '/api/v1/connections/{connection_id}'.format(connection_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_connections(self):
        """Test case for get_connections

        Get all connection entries
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        response = self.client.open(
            '/api/v1/connections',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_connection(self):
        """Test case for update_connection

        Update a connection entry
        """
        body = null
        query_string = [('update_mask', 'update_mask_example')]
        response = self.client.open(
            '/api/v1/connections/{connection_id}'.format(connection_id=56),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
