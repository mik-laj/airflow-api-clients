# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.dag_run import DAGRun  # noqa: E501
from openapi_server.models.dag_run_collection import DAGRunCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.list_dag_runs_form import ListDagRunsForm  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDAGRunController(BaseTestCase):
    """DAGRunController integration test stubs"""

    def test_create_dag_run(self):
        """Test case for create_dag_run

        Trigger a DAG Run
        """
        dag_run = {
  "end_date" : "2000-01-23T04:56:07.000+00:00",
  "execution_date" : "2000-01-23T04:56:07.000+00:00",
  "dag_run_id" : "dag_run_id",
  "external_trigger" : true,
  "conf" : "{}",
  "dag_id" : "dag_id",
  "start_date" : "2000-01-23T04:56:07.000+00:00"
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(dag_run),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dag_run(self):
        """Test case for delete_dag_run

        Delete a DAG Run
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_run(self):
        """Test case for get_dag_run

        Get a DAG Run
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_runs(self):
        """Test case for get_dag_runs

        Get all DAG Runs
        """
        query_string = [('limit', 100),
                        ('offset', 1),
                        ('execution_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('execution_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_lte', '2013-10-20T19:20:30+01:00')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns'.format(dag_id='dag_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dag_runs_batch(self):
        """Test case for get_dag_runs_batch

        Get all DAG Runs from aall DAGs.
        """
        list_dag_runs_form = {
  "start_date_gte" : "2000-01-23T04:56:07.000+00:00",
  "end_date_lte" : "2000-01-23T04:56:07.000+00:00",
  "execution_date_gte" : "2000-01-23T04:56:07.000+00:00",
  "page_limit" : 1,
  "execution_date_lte" : "2000-01-23T04:56:07.000+00:00",
  "page_offset" : 0,
  "end_date_gte" : "2000-01-23T04:56:07.000+00:00",
  "start_date_lte" : "2000-01-23T04:56:07.000+00:00",
  "dag_ids" : [ "dag_ids", "dag_ids" ]
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/~/dagRuns/list',
            method='POST',
            headers=headers,
            data=json.dumps(list_dag_runs_form),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_dag_run(self):
        """Test case for update_dag_run

        Update a DAG Run
        """
        dag_run = {
  "end_date" : "2000-01-23T04:56:07.000+00:00",
  "execution_date" : "2000-01-23T04:56:07.000+00:00",
  "dag_run_id" : "dag_run_id",
  "external_trigger" : true,
  "conf" : "{}",
  "dag_id" : "dag_id",
  "start_date" : "2000-01-23T04:56:07.000+00:00"
}
        query_string = [('update_mask', 'update_mask_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(dag_run),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
