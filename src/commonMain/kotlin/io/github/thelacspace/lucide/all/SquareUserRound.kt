package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareUserRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,21.0f)
                curveTo(17.985228f,17.696766f,15.3032675f,15.0267725f,12.0f,15.0267725f)
                curveTo(8.6967325f,15.0267725f,6.0147724f,17.696766f,6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,11.0f)
                curveTo(7.99359f,12.433324f,8.7545805f,13.760521f,9.994819f,14.479039f)
                curveTo(11.235056f,15.197558f,12.764944f,15.197558f,14.005181f,14.479039f)
                curveTo(15.2454195f,13.760521f,16.00641f,12.433324f,16.0f,11.0f)
                curveTo(16.00641f,9.566676f,15.2454195f,8.239479f,14.005181f,7.5209603f)
                curveTo(12.764944f,6.8024416f,11.235056f,6.8024416f,9.994819f,7.5209603f)
                curveTo(8.7545805f,8.239479f,7.99359f,9.566676f,8.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.SquareUserRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareUserRound: ImageVector
    @Composable get() = SquareUserRoundDefinition.asImageVector()
