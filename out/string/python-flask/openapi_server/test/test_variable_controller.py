# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.variable import Variable  # noqa: E501
from openapi_server.models.variable_collection import VariableCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestVariableController(BaseTestCase):
    """VariableController integration test stubs"""

    def test_create_variable(self):
        """Test case for create_variable

        Create a variable
        """
        variable = null
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/variables',
            method='POST',
            headers=headers,
            data=json.dumps(variable),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_variable(self):
        """Test case for delete_variable

        Delete variable
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/variables/{variable_key}'.format(variable_key='variable_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_variable(self):
        """Test case for get_variable

        Get a variable by key
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/variables/{variable_key}'.format(variable_key='variable_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_variables(self):
        """Test case for get_variables

        Get all variables
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/variables',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_variable(self):
        """Test case for update_variable

        Update a variable by key
        """
        variable = null
        query_string = [('update_mask', 'update_mask_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/variables/{variable_key}'.format(variable_key='variable_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(variable),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
