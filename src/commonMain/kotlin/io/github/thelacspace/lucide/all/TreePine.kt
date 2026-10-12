package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreePine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,14.0)
                lineTo(20.0,17.299999237060547)
                curveTo(20.280120849609375,17.5856990814209,20.36297607421875,18.01087188720703,20.21063232421875,18.380847930908203)
                curveTo(20.05828857421875,18.750825881958008,19.700075149536133,18.994380950927734,19.299999237060547,19.0)
                lineTo(4.699999809265137,19.0)
                curveTo(4.299924373626709,18.994380950927734,3.9417107105255127,18.750825881958008,3.7893669605255127,18.380847930908203)
                curveTo(3.637023448944092,18.0108699798584,3.719879388809204,17.5856990814209,3.999999761581421,17.299999237060547)
                lineTo(7.0,14.0)
                lineTo(6.699999809265137,14.0)
                curveTo(6.299924850463867,13.994379997253418,5.941711902618408,13.750825881958008,5.789368152618408,13.38084888458252)
                curveTo(5.637024879455566,13.010870933532715,5.7198805809021,12.585700035095215,6.0,12.300000190734863)
                lineTo(9.0,9.0)
                lineTo(8.800000190734863,9.0)
                curveTo(8.381598472595215,9.03774356842041,7.98421573638916,8.809956550598145,7.805337905883789,8.429841041564941)
                curveTo(7.626460075378418,8.049726486206055,7.704230308532715,7.598337650299072,8.0,7.300000190734863)
                lineTo(12.0,3.0)
                lineTo(16.0,7.300000190734863)
                curveTo(16.29576873779297,7.598337650299072,16.3735408782959,8.049726486206055,16.19466209411621,8.429841041564941)
                curveTo(16.015785217285156,8.809956550598145,15.618401527404785,9.03774356842041,15.199999809265137,9.0)
                lineTo(15.0,9.0)
                lineTo(18.0,12.300000190734863)
                curveTo(18.280118942260742,12.585700988769531,18.36297607421875,13.010871887207031,18.21063232421875,13.38084888458252)
                curveTo(18.05828857421875,13.750825881958008,17.700075149536133,13.994379997253418,17.299999237060547,14.0)
                lineTo(17.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,19.0)
            }
}

public val LucideIcons.All.TreePineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreePine: ImageVector
    @Composable get() = TreePineDefinition.asImageVector()
