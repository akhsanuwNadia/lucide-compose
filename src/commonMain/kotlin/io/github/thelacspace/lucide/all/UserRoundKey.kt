package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,11.0f)
                lineTo(19.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,13.0f)
                lineTo(21.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                curveTo(1.9997834f,17.954344f,3.728957f,15.172765f,6.4602532f,13.825158f)
                curveTo(9.19155f,12.477551f,12.451107f,12.797718f,14.868f,14.651f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                curveTo(4.991987f,9.791655f,5.943226f,11.450651f,7.4935226f,12.3488f)
                curveTo(9.043819f,13.246948f,10.956181f,13.246948f,12.506477f,12.3488f)
                curveTo(14.056774f,11.450651f,15.008013f,9.791655f,15.0f,8.0f)
                curveTo(15.008013f,6.2083454f,14.056774f,4.549349f,12.506477f,3.6512005f)
                curveTo(10.956181f,2.7530522f,9.043819f,2.7530522f,7.4935226f,3.6512005f)
                curveTo(5.943226f,4.549349f,4.991987f,6.2083454f,5.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,19.0f)
                curveTo(16.996796f,19.716661f,17.37729f,20.38026f,17.99741f,20.73952f)
                curveTo(18.617527f,21.09878f,19.382473f,21.09878f,20.00259f,20.73952f)
                curveTo(20.62271f,20.38026f,21.003204f,19.716661f,21.0f,19.0f)
                curveTo(21.003204f,18.283339f,20.62271f,17.61974f,20.00259f,17.26048f)
                curveTo(19.382473f,16.90122f,18.617527f,16.90122f,17.99741f,17.26048f)
                curveTo(17.37729f,17.61974f,16.996796f,18.283339f,17.0f,19.0f)
            }
}

public val LucideIcons.All.UserRoundKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundKey: ImageVector
    @Composable get() = UserRoundKeyDefinition.asImageVector()
