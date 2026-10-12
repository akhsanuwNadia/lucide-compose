package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MilkOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(16.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(9.0,3.3429999351501465)
                moveTo(15.0,2.0)
                lineTo(15.0,4.789000034332275)
                curveTo(15.000020027160645,5.578788757324219,15.233844757080078,6.35089635848999,15.67199993133545,7.008000373840332)
                lineTo(16.327999114990234,7.992000579833984)
                curveTo(16.76634407043457,8.649388313293457,17.00017738342285,9.421871185302734,17.0,10.212000846862793)
                lineTo(17.0,11.343000411987305)
                moveTo(7.800000190734863,7.800000190734863)
                lineTo(7.672000408172607,7.992000102996826)
                curveTo(7.23365592956543,8.64938735961914,6.999823093414307,9.421871185302734,7.0,10.211999893188477)
                lineTo(7.0,20.0)
                curveTo(7.0,21.104570388793945,7.895430564880371,22.0,9.0,22.0)
                lineTo(15.0,22.0)
                curveTo(16.104570388793945,22.0,17.0,21.104570388793945,17.0,20.0)
                lineTo(17.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                curveTo(8.59932804107666,14.32998275756836,10.40067195892334,14.32998275756836,12.0,15.0)
                curveTo(13.084243774414062,15.454273223876953,14.271742820739746,15.604655265808105,15.434999465942383,15.4350004196167)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.MilkOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MilkOff: ImageVector
    @Composable get() = MilkOffDefinition.asImageVector()
