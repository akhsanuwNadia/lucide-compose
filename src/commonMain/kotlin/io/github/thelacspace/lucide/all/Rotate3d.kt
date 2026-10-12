package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rotate3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.194f,13.707f)
                lineTo(19.008f,15.566999f)
                lineTo(17.147999f,19.380999f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.47214f,7.52786f)
                curveTo(15.312866f,2.890774f,12.573892f,0.79460645f,10.162977f,2.6993902f)
                curveTo(7.7520638f,4.604174f,6.468819f,9.878166f,7.2070546f,14.847899f)
                curveTo(7.94529f,19.817633f,10.460162f,22.83484f,13.0f,21.79796f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.79796f,11.0f)
                curveTo(20.883368f,8.759704f,17.04589f,7.1150403f,12.478136f,7.005715f)
                curveTo(7.910381f,6.896389f,3.7762616f,8.350259f,2.4378731f,10.536633f)
                curveTo(1.0994848f,12.723005f,2.8978634f,15.084769f,6.805477f,16.272493f)
                curveTo(10.713091f,17.460217f,15.734235f,17.171255f,19.0f,15.57071f)
            }
}

public val LucideIcons.All.Rotate3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rotate3d: ImageVector
    @Composable get() = Rotate3dDefinition.asImageVector()
