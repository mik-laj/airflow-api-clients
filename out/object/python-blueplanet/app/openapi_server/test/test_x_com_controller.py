# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.x_com import XCom  # noqa: E501
from app.openapi_server.models.x_com_collection import XComCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestXComController(BaseTestCase):
    """XComController integration test stubs"""

    def test_delete_x_com_value(self):
        """Test case for delete_x_com_value

        Delete an XCom entry
        """
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', key='key_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_x_com_entry(self):
        """Test case for get_x_com_entry

        Get all XCom entries
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_x_com_value(self):
        """Test case for get_x_com_value

        Get an XCom entry
        """
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', key='key_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_x_com_entry(self):
        """Test case for update_x_com_entry

        Create an XCom entry
        """
        body = null
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_x_com_value(self):
        """Test case for update_x_com_value

        Update an XCom entry
        """
        body = null
        query_string = [('update_mask', 'update_mask_example')]
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', key='key_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
