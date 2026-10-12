package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EarthLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,3.34f)
                lineTo(7.0f,5.0f)
                curveTo(7.0f,6.656854f,8.343145f,8.0f,10.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,21.95f)
                lineTo(11.0f,18.0f)
                curveTo(11.0f,16.89543f,10.104569f,16.0f,9.0f,16.0f)
                curveTo(7.8954306f,16.0f,7.0f,15.104569f,7.0f,14.0f)
                lineTo(7.0f,13.0f)
                curveTo(7.0f,11.895431f,6.1045694f,11.0f,5.0f,11.0f)
                lineTo(2.05f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.54f,15.0f)
                lineTo(17.0f,15.0f)
                curveTo(15.895431f,15.0f,15.0f,15.895431f,15.0f,17.0f)
                lineTo(15.0f,21.54f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                curveTo(6.8698187f,2.0003123f,2.5720403f,5.882741f,2.0521f,10.986506f)
                curveTo(1.5321596f,16.090273f,4.958736f,20.759611f,9.983463f,21.794443f)
                curveTo(15.008191f,22.829275f,20.000946f,19.89388f,21.54f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,6.0f)
                lineTo(20.0f,4.0f)
                curveTo(20.003204f,3.283338f,19.62271f,2.6197395f,19.00259f,2.2604802f)
                curveTo(18.382473f,1.9012209f,17.617527f,1.9012209f,16.99741f,2.2604802f)
                curveTo(16.37729f,2.6197395f,15.996795f,3.283338f,16.0f,4.0f)
                lineTo(16.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                lineTo(21.0f,6.0f)
                lineTo(22.0f,6.0f)
                lineTo(22.0f,11.0f)
                lineTo(21.0f,11.0f)
                lineTo(15.0f,11.0f)
                lineTo(14.0f,11.0f)
                lineTo(14.0f,6.0f)
                lineTo(15.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.EarthLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EarthLock: ImageVector
    @Composable get() = EarthLockDefinition.asImageVector()
