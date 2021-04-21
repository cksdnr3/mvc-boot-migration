import Home from 'common/component/Home'
import {ArticleList, ArticleWrite, ArticleDetail, ArticleUpdate} from 'article/index'
import {Login, Signup, UserDetail} from 'user/index'
import {News, SeoulCCTV } from 'board/index'
import { Counter, ReduxCounter } from 'counter/index'

import 'App.css';
import { Route } from 'react-router-dom'

const App = () => {
  return (
    <div className="App">
      <Route exact path='/' component={ Home } />

      <Route exact path='/article/article-list' component={ ArticleList } />
      <Route exact path='/article/article-write' component={ ArticleWrite } />
      <Route exact path='/article/article-detail' component={ ArticleDetail } />
      <Route exact path='/article/article-update' component={ ArticleUpdate } />
      <Route exact path='/article/seoul-cctv' component={ SeoulCCTV } />

      <Route exact path='/board/news' component={ News } />/

      <Route exact path='/counter/counter' component={ Counter } />
      <Route exact path='/counter/redux-counter' component={ ReduxCounter } />

      <Route exact path='/user/login' component={Login} />
      <Route exact path='/user/signup' component={Signup} />
      <Route exact path='/user/user-detail' component={UserDetail} />
    </div>
  );
}

export default App;