package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radiation") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.4641f)
                curveTo(12.762396f,16.17863f,11.237604f,16.17863f,10.0f,15.4641f)
                lineTo(7.52786f,19.74597f)
                curveTo(7.3855963f,19.992378f,7.355035f,20.287724f,7.443828f,20.55804f)
                curveTo(7.532622f,20.82836f,7.732362f,21.048054f,7.99303f,21.16211f)
                curveTo(10.547536f,22.2793f,13.452464f,22.2793f,16.00697f,21.16211f)
                curveTo(16.267637f,21.048054f,16.467379f,20.82836f,16.556171f,20.55804f)
                curveTo(16.644964f,20.287724f,16.614403f,19.992378f,16.47214f,19.74597f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                curveTo(15.999964f,10.570974f,15.237573f,9.250513f,14.0f,8.536f)
                lineTo(16.472f,4.254f)
                curveTo(16.614283f,4.0073204f,16.85499f,3.833003f,17.133745f,3.77477f)
                curveTo(17.4125f,3.7165368f,17.70286f,3.779912f,17.932f,3.9490001f)
                curveTo(20.176336f,5.6027937f,21.628428f,8.118395f,21.938f,10.889f)
                curveTo(21.968966f,11.162378f,21.885931f,11.436438f,21.708445f,11.646659f)
                curveTo(21.530958f,11.85688f,21.2747f,11.984691f,21.0f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(8.000036f,10.570974f,8.762427f,9.250513f,10.0f,8.536f)
                lineTo(7.528f,4.254f)
                curveTo(7.3857164f,4.00732f,7.1450105f,3.8330026f,6.8662553f,3.7747693f)
                curveTo(6.5874996f,3.7165363f,6.297139f,3.7799118f,6.068f,3.9490001f)
                curveTo(3.823662f,5.6027937f,2.3715725f,8.118396f,2.0619998f,10.889f)
                curveTo(2.0310345f,11.162378f,2.1140692f,11.436438f,2.291556f,11.646659f)
                curveTo(2.4690423f,11.85688f,2.7253f,11.984691f,3.0f,12.0f)
                close()
            }
}

public val LucideIcons.All.RadiationDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radiation: ImageVector
    @Composable get() = RadiationDefinition.asImageVector()
