package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trees") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(10.0,10.199999809265137)
                curveTo(11.353411674499512,10.720466613769531,12.140851020812988,12.134449005126953,11.870660781860352,13.559090614318848)
                curveTo(11.600469589233398,14.983733177185059,10.349993705749512,16.011213302612305,8.899999618530273,16.0)
                lineTo(5.0,16.0)
                curveTo(3.5683858394622803,15.964381217956543,2.3615527153015137,14.921884536743164,2.1182363033294678,13.510648727416992)
                curveTo(1.8749197721481323,12.099413871765137,2.6629700660705566,10.712970733642578,4.0,10.199999809265137)
                lineTo(4.0,10.0)
                curveTo(4.007386207580566,8.348382949829102,5.3483662605285645,7.013386249542236,7.0,7.013386249542236)
                curveTo(8.651634216308594,7.013386249542236,9.992613792419434,8.348382949829102,10.0,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,16.0)
                lineTo(7.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,19.0)
                lineTo(13.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(20.299999237060547,19.0)
                curveTo(20.700075149536133,18.994380950927734,21.05828857421875,18.750825881958008,21.21063232421875,18.380847930908203)
                curveTo(21.36297607421875,18.01087188720703,21.280120849609375,17.5856990814209,21.0,17.299999237060547)
                lineTo(18.0,14.0)
                lineTo(18.299999237060547,14.0)
                curveTo(18.700075149536133,13.994379997253418,19.05828857421875,13.750825881958008,19.21063232421875,13.38084888458252)
                curveTo(19.36297607421875,13.010871887207031,19.280118942260742,12.585700988769531,19.0,12.300000190734863)
                lineTo(16.0,9.0)
                lineTo(16.200000762939453,9.0)
                curveTo(16.6184024810791,9.037742614746094,17.015785217285156,8.809955596923828,17.19466209411621,8.429841041564941)
                curveTo(17.373538970947266,8.049725532531738,17.29576873779297,7.598337650299072,17.0,7.300000190734863)
                lineTo(13.0,3.0)
                lineTo(11.600000381469727,4.5)
            }
}

public val LucideIcons.All.TreesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trees: ImageVector
    @Composable get() = TreesDefinition.asImageVector()
