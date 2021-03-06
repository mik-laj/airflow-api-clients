# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.clear_task_instance import ClearTaskInstance  # noqa: E501
from openapi_server.models.dag import DAG  # noqa: E501
from openapi_server.models.dag_collection import DAGCollection  # noqa: E501
from openapi_server.models.dag_detail import DAGDetail  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from openapi_server.models.task import Task  # noqa: E501
from openapi_server.models.task_collection import TaskCollection  # noqa: E501
from openapi_server.models.task_instance_reference_collection import TaskInstanceReferenceCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDAGController(BaseTestCase):
    """DAGController integration test stubs"""

    def test_clear_task_instance(self):
        """Test case for clear_task_instance

        Clears a set of task instances associated with the DAG for a specified date range.
        """
        clear_task_instance = {
  "end_date" : "end_date",
  "only_running" : "only_running",
  "reset_dag_runs" : true,
  "include_parentdag" : true,
  "include_subdags" : true,
  "dry_run" : true,
  "only_failed" : "only_failed",
  "start_date" : "start_date"
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/clearTaskInstances'.format(dag_id='dag_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(clear_task_instance),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag(self):
        """Test case for get_dag

        Get basic information about a DAG
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}'.format(dag_id='dag_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_detail(self):
        """Test case for get_dag_detail

        Get a simplified representation of DAG.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/details'.format(dag_id='dag_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_source(self):
        """Test case for get_dag_source

        Get source code using file token
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dagSources/{file_token}'.format(file_token='file_token_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dags(self):
        """Test case for get_dags

        Get all DAGs
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task(self):
        """Test case for get_task

        Get simplified representation of a task.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/tasks/{task_id}'.format(dag_id='dag_id_example', task_id='task_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_tasks(self):
        """Test case for get_tasks

        Get tasks for DAG
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/tasks'.format(dag_id='dag_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_dag(self):
        """Test case for update_dag

        Update a DAG
        """
        dag = {
  "root_dag_id" : "root_dag_id",
  "is_paused" : true,
  "description" : "description",
  "schedule_interval" : "",
  "file_token" : "file_token",
  "owners" : [ "owners", "owners" ],
  "dag_id" : "dag_id",
  "is_subdag" : true,
  "fileloc" : "fileloc",
  "tags" : [ {
    "name" : "name"
  }, {
    "name" : "name"
  } ]
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}'.format(dag_id='dag_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(dag),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
