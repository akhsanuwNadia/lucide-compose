package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldUser") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,13.0f)
                curveTo(20.0f,18.0f,16.5f,20.5f,12.34f,21.95f)
                curveTo(12.122163f,22.023819f,11.885537f,22.020287f,11.67f,21.94f)
                curveTo(7.5f,20.5f,4.0f,18.0f,4.0f,13.0f)
                lineTo(4.0f,6.0f)
                curveTo(4.0f,5.4477153f,4.4477153f,5.0f,5.0f,5.0f)
                curveTo(7.0f,5.0f,9.5f,3.8f,11.24f,2.28f)
                curveTo(11.677673f,1.906067f,12.322327f,1.906067f,12.76f,2.28f)
                curveTo(14.51f,3.81f,17.0f,5.0f,19.0f,5.0f)
                curveTo(19.552284f,5.0f,20.0f,5.4477153f,20.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.376f,18.91f)
                curveTo(7.249901f,16.559288f,9.493646f,15.000089f,12.001543f,15.000757f)
                curveTo(14.50944f,15.001427f,16.752354f,16.561823f,17.625f,18.913f)
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
}

public val LucideIcons.All.ShieldUserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldUser: ImageVector
    @Composable get() = ShieldUserDefinition.asImageVector()
