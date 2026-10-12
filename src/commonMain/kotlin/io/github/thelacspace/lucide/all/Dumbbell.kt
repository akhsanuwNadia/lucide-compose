package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dumbbell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.596f,12.768f)
                curveTo(18.100594f,13.277125f,18.83903f,13.47735f,19.531694f,13.292857f)
                curveTo(20.22436f,13.108365f,20.765366f,12.567358f,20.94986f,11.874693f)
                curveTo(21.134352f,11.182027f,20.934128f,10.443592f,20.425001f,9.938999f)
                lineTo(18.657001f,8.171999f)
                curveTo(19.43922f,8.946979f,20.70072f,8.943934f,21.479189f,8.165189f)
                curveTo(22.25766f,7.3864436f,22.260256f,6.1249437f,21.485f,5.342999f)
                lineTo(18.657001f,2.514999f)
                curveTo(17.875057f,1.7397426f,16.613556f,1.7423403f,15.83481f,2.5208104f)
                curveTo(15.056066f,3.2992804f,15.053021f,4.56078f,15.828001f,5.342999f)
                lineTo(14.061001f,3.5749989f)
                curveTo(13.556409f,3.065873f,12.817973f,2.865648f,12.125308f,3.0501409f)
                curveTo(11.432643f,3.2346337f,10.891636f,3.7756405f,10.707143f,4.4683056f)
                curveTo(10.52265f,5.1609707f,10.722875f,5.8994064f,11.232f,6.403999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.5f,21.5f)
                lineTo(3.9f,20.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.1f,3.9f)
                lineTo(21.5f,2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.343f,21.485f)
                curveTo(5.847413f,21.994125f,6.5856824f,22.194445f,7.278258f,22.010107f)
                curveTo(7.970833f,21.82577f,8.51184f,21.284954f,8.696423f,20.592445f)
                curveTo(8.881005f,19.899935f,8.680946f,19.161594f,8.172f,18.657001f)
                lineTo(9.939f,20.425001f)
                curveTo(10.443593f,20.934128f,11.182028f,21.134352f,11.874693f,20.949858f)
                curveTo(12.567358f,20.765366f,13.108365f,20.22436f,13.292858f,19.531694f)
                curveTo(13.47735f,18.839027f,13.277125f,18.100594f,12.768f,17.596f)
                lineTo(6.404f,11.232f)
                curveTo(5.8994074f,10.722875f,5.1609716f,10.52265f,4.4683065f,10.707143f)
                curveTo(3.7756414f,10.891636f,3.2346346f,11.432643f,3.0501418f,12.125308f)
                curveTo(2.865649f,12.817973f,3.0658739f,13.556409f,3.5749998f,14.061001f)
                lineTo(5.343f,15.828001f)
                curveTo(4.560781f,15.053021f,3.2992814f,15.056066f,2.5208113f,15.83481f)
                curveTo(1.7423413f,16.613556f,1.7397436f,17.875057f,2.5149999f,18.657001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.6f,14.4f)
                lineTo(14.400001f,9.599999f)
            }
}

public val LucideIcons.All.DumbbellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dumbbell: ImageVector
    @Composable get() = DumbbellDefinition.asImageVector()
