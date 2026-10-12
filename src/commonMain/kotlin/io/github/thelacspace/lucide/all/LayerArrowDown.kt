package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayerArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(12.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                curveTo(22.003132f,10.396521f,21.771677f,10.757434f,21.41f,10.92f)
                lineTo(16.333f,13.228001f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.017f,10.005f)
                curveTo(22.017317f,9.608276f,21.783081f,9.248879f,21.42f,9.089f)
                lineTo(12.83f,5.179f)
                curveTo(12.3026495f,4.9388413f,11.697061f,4.939206f,11.17f,5.18f)
                lineTo(2.6f,9.08f)
                curveTo(2.2350295f,9.235595f,1.9965624f,9.592241f,1.9922289f,9.988971f)
                curveTo(1.9878954f,10.3857f,2.2185152f,10.747471f,2.58f,10.911f)
                lineTo(7.673f,13.227f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(12.0f,20.0f)
                lineTo(15.0f,17.0f)
            }
}

public val LucideIcons.All.LayerArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayerArrowDown: ImageVector
    @Composable get() = LayerArrowDownDefinition.asImageVector()
