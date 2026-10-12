package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Parasol") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5,11.133999824523926)
                lineTo(18.195999145507812,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.424999237060547,5.298999786376953)
                curveTo(17.265396118164062,1.792365312576294,12.084067344665527,0.9725449085235596,7.996226787567139,3.3324458599090576)
                curveTo(3.908385753631592,5.692347049713135,2.027320623397827,10.58927059173584,3.483999252319336,15.078999519348145)
                curveTo(3.666999340057373,15.641999244689941,4.326999187469482,15.852999687194824,4.838999271392822,15.556999206542969)
                lineTo(20.15999984741211,6.710999965667725)
                curveTo(20.671998977661133,6.414999961853027,20.81999969482422,5.73799991607666,20.423999786376953,5.297999858856201)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(3.0,21.0)
            }
}

public val LucideIcons.All.ParasolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Parasol: ImageVector
    @Composable get() = ParasolDefinition.asImageVector()
