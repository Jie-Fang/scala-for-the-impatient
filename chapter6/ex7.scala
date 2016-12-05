object puke extends Enumeration {
  type huase = Value
  val heitao = Value("♠")
  val meihua = Value("♣")
  val hongxin = Value("♥")
  val fangkuai = Value("♦")
  def isRed(card: huase) = card == hongxin || card == fangkuai
}


