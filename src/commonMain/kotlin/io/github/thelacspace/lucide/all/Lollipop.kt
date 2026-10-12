package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lollipop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                curveTo(2.98718f,13.866648f,4.5091615f,16.521042f,6.9896364f,17.958078f)
                curveTo(9.470112f,19.395117f,12.529888f,19.395117f,15.010364f,17.958078f)
                curveTo(17.490839f,16.521042f,19.01282f,13.866648f,19.0f,11.0f)
                curveTo(19.01282f,8.133352f,17.490839f,5.478958f,15.010364f,4.0419207f)
                curveTo(12.529888f,2.6048834f,9.470112f,2.6048834f,6.9896364f,4.0419207f)
                curveTo(4.5091615f,5.478958f,2.98718f,8.133352f,3.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(16.7f,16.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,11.0f)
                curveTo(11.004924f,12.101078f,11.8989105f,12.9910755f,13.0f,12.9910755f)
                curveTo(14.1010895f,12.9910755f,14.995076f,12.101078f,15.0f,11.0f)
                curveTo(14.990151f,8.797844f,13.202178f,7.0178485f,11.0f,7.0178485f)
                curveTo(8.797822f,7.0178485f,7.0098486f,8.797844f,7.0f,11.0f)
                curveTo(7.0147724f,14.303234f,9.6967325f,16.973227f,13.0f,16.973227f)
                curveTo(16.303268f,16.973227f,18.985228f,14.303234f,19.0f,11.0f)
            }
}

public val LucideIcons.All.LollipopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lollipop: ImageVector
    @Composable get() = LollipopDefinition.asImageVector()
