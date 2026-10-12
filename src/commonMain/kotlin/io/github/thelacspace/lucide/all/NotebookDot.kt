package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotebookDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,11.75)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(6.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,18.0)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,11.75)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(11.649999618530273,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                curveTo(14.995192527770996,6.074992656707764,15.565935134887695,7.070390701293945,16.496112823486328,7.609279632568359)
                curveTo(17.426292419433594,8.148168563842773,18.573707580566406,8.148168563842773,19.503887176513672,7.609279632568359)
                curveTo(20.434064865112305,7.070390701293945,21.00480842590332,6.074992656707764,21.0,5.0)
                curveTo(21.00480842590332,3.9250071048736572,20.434064865112305,2.9296092987060547,19.503887176513672,2.3907203674316406)
                curveTo(18.573707580566406,1.851831316947937,17.426292419433594,1.851831316947937,16.496112823486328,2.3907203674316406)
                curveTo(15.565935134887695,2.9296092987060547,14.995192527770996,3.9250071048736572,15.0,5.0)
            }
}

public val LucideIcons.All.NotebookDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotebookDot: ImageVector
    @Composable get() = NotebookDotDefinition.asImageVector()
