package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreeDeciduous") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,19.0f)
                curveTo(6.2384014f,19.003946f,4.681595f,17.854975f,4.16612f,16.170477f)
                curveTo(3.6506455f,14.48598f,4.2978654f,12.662552f,5.76f,11.68f)
                curveTo(4.861493f,10.5573225f,4.7410784f,8.999321f,5.4564066f,7.751913f)
                curveTo(6.1717343f,6.5045047f,7.577233f,5.821541f,9.0f,6.03f)
                lineTo(9.0f,6.0f)
                curveTo(8.995193f,4.9250073f,9.565935f,3.9296093f,10.496114f,3.3907204f)
                curveTo(11.426291f,2.8518312f,12.573709f,2.8518312f,13.503886f,3.3907204f)
                curveTo(14.434065f,3.9296093f,15.004807f,4.9250073f,15.0f,6.0f)
                lineTo(15.0f,6.04f)
                curveTo(16.422768f,5.8315406f,17.828266f,6.5145044f,18.543594f,7.761913f)
                curveTo(19.258923f,9.009321f,19.138508f,10.567323f,18.24f,11.690001f)
                curveTo(19.692728f,12.675685f,20.332962f,14.493412f,19.818613f,16.171936f)
                curveTo(19.304264f,17.850458f,17.755558f,18.997429f,16.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(12.0f,22.0f)
            }
}

public val LucideIcons.All.TreeDeciduousDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreeDeciduous: ImageVector
    @Composable get() = TreeDeciduousDefinition.asImageVector()
