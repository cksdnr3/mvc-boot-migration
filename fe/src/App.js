import Home from 'common/component/Home'
import {ArticleList, ArticleWrite, ArticleDetail, ArticleUpdate} from 'article/index'
import {News, SeoulCCTV } from 'board/index'
import { Counter, ReduxCounter } from 'counter/index'
import { Login, MyPage, Signup} from 'uss/index'
import 'App.css';
import { Route } from 'react-router-dom'
import { Todo, TodosApp, Todos } from 'todos'

const App = () => {
  return (
    <div className="App">
      <Route exact path='/' component={ Home } />

      <Route exact path='/article/article-list' component={ ArticleList } />
      <Route exact path='/article/article-write' component={ ArticleWrite } />
      <Route exact path='/article/article-detail' component={ ArticleDetail } />
      <Route exact path='/article/article-update' component={ ArticleUpdate } />
      <Route exact path='/article/seoul-cctv' component={ SeoulCCTV } />

      <Route exact path='/board/news' component={ News } />

      <Route exact path='/counter/counter' component={ Counter } />
      <Route exact path='/counter/redux-counter' component={ ReduxCounter } />

      <Route exact path='/user/login' component={Login} />
      <Route exact path='/user/signup' component={Signup} />
      <Route exact path='/user/Mypage' component={MyPage} />

      <Route exact path='/todos/todo' component={ Todo } />
      <Route exact path='/todos/todos' component={ Todos } />
      <Route exact path='/todos/todo-app' component={ TodosApp } />
    </div>
  );
}

export default App;