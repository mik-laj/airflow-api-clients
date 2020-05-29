# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.variable import Variable  # noqa: E501
from app.openapi_server.models.variable_collection import VariableCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestVariableController(BaseTestCase):
    """VariableController integration test stubs"""

    def test_create_variable(self):
        """Test case for create_variable

        Create a variable
        """
        body = null
        response = self.client.open(
            '/api/v1/variables',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_variable(self):
        """Test case for delete_variable

        Delete variable
        """
        response = self.client.open(
            '/api/v1/variables/{variable_key}'.format(variable_key='variable_key_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_variable(self):
        """Test case for get_variable

        Get a variable by key
        """
        response = self.client.open(
            '/api/v1/variables/{variable_key}'.format(variable_key='variable_key_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_variables(self):
        """Test case for get_variables

        Get all variables
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        response = self.client.open(
            '/api/v1/variables',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_variable(self):
        """Test case for update_variable

        Update a variable by key
        """
        body = null
        query_string = [('update_mask', 'update_mask_example')]
        response = self.client.open(
            '/api/v1/variables/{variable_key}'.format(variable_key='variable_key_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
