package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileVolume") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,11.55f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.640058f,1.9984303f,15.254227f,2.2525938f,15.706f,2.7059999f)
                lineTo(19.294f,6.2939997f)
                curveTo(19.747406f,6.7457733f,20.00157f,7.359942f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(16.05f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                curveTo(13.333333f,16.777779f,13.333333f,19.222221f,12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.502f)
                curveTo(8.000741f,14.306249f,7.887182f,14.128069f,7.709428f,14.046079f)
                curveTo(7.5316734f,13.9640875f,7.322422f,13.993368f,7.174f,14.121f)
                lineTo(5.2809997f,15.752001f)
                curveTo(5.1000233f,15.908215f,4.8690705f,15.994423f,4.6299996f,15.995001f)
                lineTo(3.5f,15.995001f)
                curveTo(3.3672185f,15.995001f,3.2398899f,16.047815f,3.146093f,16.1418f)
                curveTo(3.052296f,16.235785f,2.9997346f,16.363218f,3.0f,16.496f)
                lineTo(3.0f,19.502f)
                curveTo(2.9997346f,19.634783f,3.052296f,19.762217f,3.146093f,19.856201f)
                curveTo(3.2398899f,19.950186f,3.3672185f,20.003f,3.5f,20.003f)
                lineTo(4.6289997f,20.003f)
                curveTo(4.868415f,20.00334f,5.0997624f,20.089563f,5.2809997f,20.246f)
                lineTo(7.174f,21.879f)
                curveTo(7.3222847f,22.006512f,7.5313005f,22.035866f,7.7089715f,21.954128f)
                curveTo(7.886642f,21.87239f,8.000348f,21.69457f,8.0f,21.499f)
                close()
            }
}

public val LucideIcons.All.FileVolumeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileVolume: ImageVector
    @Composable get() = FileVolumeDefinition.asImageVector()
