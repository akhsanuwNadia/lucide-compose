package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessKing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                curveTo(4.0,18.895429611206055,4.895430564880371,18.0,6.0,18.0)
                lineTo(18.0,18.0)
                curveTo(19.104570388793945,18.0,20.0,18.895429611206055,20.0,20.0)
                lineTo(20.0,21.0)
                curveTo(20.0,21.552284240722656,19.552284240722656,22.0,19.0,22.0)
                lineTo(5.0,22.0)
                curveTo(4.4477152824401855,22.0,4.0,21.552284240722656,4.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.699999809265137,18.0)
                lineTo(5.699999809265137,17.0)
                curveTo(4.349999904632568,15.682000160217285,3.0,14.09000015258789,3.0,12.0)
                curveTo(2.9998629093170166,9.25798511505127,5.208122253417969,7.0274200439453125,7.949999809265137,7.0)
                curveTo(9.5339994430542,7.0,10.649999618530273,7.454999923706055,12.0,8.817999839782715)
                curveTo(13.350000381469727,7.454999923706055,14.465999603271484,7.0,16.049999237060547,7.0)
                curveTo(18.79187774658203,7.027419567108154,21.000137329101562,9.25798511505127,21.0,12.0)
                curveTo(21.0,14.081999778747559,19.641000747680664,15.67300033569336,18.299999237060547,17.0)
                lineTo(17.299999237060547,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                lineTo(14.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,8.817999839782715)
            }
}

public val LucideIcons.All.ChessKingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessKing: ImageVector
    @Composable get() = ChessKingDefinition.asImageVector()
